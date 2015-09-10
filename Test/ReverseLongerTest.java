import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mfreyre on 8/29/15.
 */



    public class ReverseLongerTest {



        @Test
        public void static1() {
            assertEquals("abcdetsrifabcde",ReverseLonger.shorterReverseLonger("first", "abcde"));
            assertEquals("bauollehbau",ReverseLonger.shorterReverseLonger("hello", "bau"));
            assertEquals("fghiedcbafghi",ReverseLonger.shorterReverseLonger("abcde", "fghi"));
        }




    }

