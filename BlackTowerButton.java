import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A tower the user can place down, this tower will shoot a slow black bullet that deals a ton of damage
 * 
 * @author Rohit Terry Kisto
 * @version 2016/9/30
 */
public class BlackTowerButton extends TowerButton
{
    /**
     * Constructs a new black tower button
     * @param World world
     * @param int x position
     * @param int y position
     */
    public BlackTowerButton(World world, int x, int y)
    {
        super(world, x, y);
    }
    
    /**
     * Act - do whatever the TowerButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
       MouseInfo mouse = Greenfoot.getMouseInfo();
      
       if(mouse != null)
       {
          // If the mouse is doing something
          if(Greenfoot.mouseClicked(this))
          {
              // If the mouse is clicked on top of the button, spawn a new tower
              tempTower = new BlackTower(this.world, mouse.getX(), mouse.getY());
              towers.add(tempTower);
          }
          
          
          // If the mouse is dragged on top of the temp tower that was just spawned
          if(Greenfoot.mouseDragged(tempTower) && (towers != null))
          {
              //System.out.println(towers.size());
              towers.get(towers.size() - 1).setLocation(mouse.getX(), mouse.getY());
            }
       }
    }
}
