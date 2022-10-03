import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class myAddTest{

    private Add adding =  new Add();

    @Test
    void testWithElements(){
        assertEquals(6, adding.add(new int[]{1,2,3}));
    }

    @Test
    void testWithNoElements(){
        assertEquals(0, adding.add(new int[]{}));
    }
}