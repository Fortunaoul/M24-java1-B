import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa a bala no jogo
 * 
 * @author João Pedro
 * @version 2024-04-27
 */
public class Bala extends Actor
{
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY()-5);
        //se atingiu o alien, removemos e criamos um novo alien
        removerAlien();
        //se atingiu o topo,reovemos a bala do mundo
        if(isAtEdge()){
            //getWorld().removeObject(this);
            ((SpaceInvadersWorld) getWorld()).removerBala();
        }
    }
    /**
     *Método que verifica se a bala atingiu o alien e remove-o se atingido
     */
    public void removerAlien(){
        if(isTouching(Alien.class)){
            removeTouching(Alien.class);
            getWorld().addObject(new Alien(),
            Greenfoot.getRandomNumber(getWorld().getWidth()),50);
        }
    }
}
