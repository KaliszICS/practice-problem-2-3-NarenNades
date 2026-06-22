import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PracticeProblemTest {

   // Function 1: Calculate the area of a circle
   @Test
   void circleAreaTest1() {
      assertEquals(0, PracticeProblem.circleArea(0));
   }
   @Test
   void circleAreaTest2() {
      assertEquals(Math.PI * 9, PracticeProblem.circleArea(3));
   }
   @Test
   void circleAreaTest3() {
      assertEquals(Math.PI * 9, PracticeProblem.circleArea(-3));
   }
   @Test
   void circleAreaTest4() {
      assertEquals(Math.PI * 54321 * 54321, PracticeProblem.circleArea(54321));
   }
   @Test
   void circleAreaTest5() {
      assertEquals(Math.PI * 6.25, PracticeProblem.circleArea(2.5));
   }


   // Function 2: Convert minutes to total hours and remaining minutes
   @Test
   void minToHrTest1() {
      assertEquals("0 hours and 0 minutes", PracticeProblem.minutesToHours(0));
   }
   @Test
   void minToHrTest2() {
      assertEquals("0 hours and 45 minutes", PracticeProblem.minutesToHours(45));
   }
   @Test
   void minToHrTest3() {
      assertEquals("-1 hours and 0 minutes", PracticeProblem.minutesToHours(-60));
   }
   @Test
   void minToHrTest4() {
      assertEquals("2 hours and 0 minutes", PracticeProblem.minutesToHours(120));
   }
   @Test
   void minToHrTest5() {
      assertEquals("1 hours and 40 minutes", PracticeProblem.minutesToHours(100));
   }


   // Function 3: Calculate the simple interest earned
   @Test
   void simpleInterestTest1() {
      assertEquals(0, PracticeProblem.simpleInterest(0,0,0));
   }
   @Test
   void simpleInterestTest2() {
      assertEquals(79.86, PracticeProblem.simpleInterest(11, 22, 33));
   }
   @Test
   void simpleInterestTest3() {
      assertEquals(-79.86, PracticeProblem.simpleInterest(-11, -22, -33));
   }
   @Test
   void simpleInterestTest4() {
      assertEquals(1.1 * (2.2 / 100.0) * 3, PracticeProblem.simpleInterest(1.1, 2.2, 3));
   }
   @Test
   void simpleInterestTest5() {
      assertEquals(79860000000.0, PracticeProblem.simpleInterest(11000, 22000, 33000));
   }


   // Function 4: Calculate the hypotenuse of a right triangle
   @Test
   void hypotenuseTest1() {
      assertEquals(0, PracticeProblem.hypotenuse(0,0));
   }
   @Test
   void hypotenuseTest2() {
      assertEquals(5, PracticeProblem.hypotenuse(4, 3));
   }
   @Test
   void hypotenuseTest3() {
      assertEquals(5, PracticeProblem.hypotenuse(-4, -3));
   }
   @Test
   void hypotenuseTest4() {
      assertEquals(5000, PracticeProblem.hypotenuse(4000,3000));
   }
   @Test
   void hypotenuseTest5() {
      assertEquals(0.5, PracticeProblem.hypotenuse(0.4, 0.3));
   }

}
