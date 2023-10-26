package edu.bu.met.cs665;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;



    public class RestaurantOrderingSystemTests {

        private Meal meal;
        private ConcreteMealBuilder concreteMealBuilder;

        @BeforeEach
        public void setUp() {
            meal = new Meal();
            concreteMealBuilder = new ConcreteMealBuilder();
        }

        @Test
        public void testSetMainCourse() {
            meal.setMainCourse("Pizza");
            assertEquals("Pizza", meal.getMainCourse());
        }

        @Test
        public void testSetSide() {
            meal.setSide("Fries");
            assertEquals("Fries", meal.getSide());
        }

        @Test
        public void testSetDrink() {
            meal.setDrink("Coke");
            assertEquals("Coke", meal.getDrink());
        }

        @Test
        public void testBuild() {
            Meal meal = concreteMealBuilder
                    .mainCourse("Burger")
                    .side("Fries")
                    .drink("Coke")
                    .build();

            assertEquals("Burger", meal.getMainCourse());
            assertEquals("Fries", meal.getSide());
            assertEquals("Coke", meal.getDrink());
        }

        @Test
        public void testSingleton() {
            Menu menu1 = Menu.getInstance();
            Menu menu2 = Menu.getInstance();

            assertSame(menu1, menu2);
        }

        @Test
        public void testGetMainCourses() {
            Menu menu = Menu.getInstance();
            String[] mainCourses = menu.getMainCourses();

            assertEquals(5, mainCourses.length);
        }

        @Test
        public void testGetSides() {
            Menu menu = Menu.getInstance();
            String[] sides = menu.getSides();

            assertEquals(5, sides.length);
        }

        @Test
        public void testGetDrinks() {
            Menu menu = Menu.getInstance();
            String[] drinks = menu.getDrinks();

            assertEquals(5, drinks.length);
        }
    }


