package nglo.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void testDistance (){
        Point p1 = new Point(5,6);
        Point p2 = new Point(12,13);
        Assert.assertEquals(Point.distance(p1,p2),9.89);

    }

}
