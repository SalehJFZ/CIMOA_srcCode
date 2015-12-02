import client.WorldModel;

/**
 * Created by Amir Shams on 11/29/2015.
 */
public class PathData
{
    int [][] distance;
    String [][] parent;
    int width,height;
    Position source;
    public PathData(int[][] matrix,Position source)
    {
        this.source = source;
        this.width = matrix.length;
        this.height = matrix[0].length;

        parent = new String[width][height];
        distance = new int[width][height];
        for(int i=0;i<width;i++)
            for(int j=0;j<height;j++)
            {
                distance[i][j] = 1000; //inf
                parent[i][j] = "";
            }

        distance[source.x][source.y] = 0;
    }
    public String toPath(Position destination)
    {
        String path = "";

        return null;
    }
}
