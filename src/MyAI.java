import client.PlayerAI;
import client.Unit;
import client.UnitType;
import client.WorldModel;
import client.commands.Direction;
import server.Settings;

import java.util.Random;

/**
 * Created by Pouya Payandeh on 11/30/2015.
 */
public class MyAI implements PlayerAI
{

    @Override
    public void doTurn(WorldModel wm)
    {


        Unit c = wm.self.agents.get(0);
//        wm.self.agents.get(0).move();
//        Random r= new Random();
//        int k = 1; //<< r.nextInt(32);
        SearchAlgorithms searchAlgorithms = new SearchAlgorithms();

        PathData pathData = searchAlgorithms.BFS(wm.cloneTerrain(), new Position(c.getPos().x, c.getPos().y));
     //   String pathData.to
//        for(int i = 1 ; i < wm.self.agents.size() ; i++)
//        {
//            Unit mc = wm.self.agents.get(i);
//            double chance = r.nextDouble();
//            if(chance < 0.25)
//                mc.move(Direction.N);
//            else if(chance < 0.5)
//                mc.move(Direction.S);
//            else if(chance < 0.75)
//                mc.move(Direction.E);
//            else
//                mc.move(Direction.W);
//        }
//
//        if(r.nextDouble() > 0.5)
//            c.make(Direction.E, UnitType.WORKER);
//        else
//            c.make(Direction.W,UnitType.WORKER);
//
//        if(r.nextDouble() > 0.5)
//            c.attack(Direction.E);
    }
}
