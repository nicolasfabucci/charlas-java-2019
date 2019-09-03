package com.eiv.testing;

import static org.junit.Assert.assertThat;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Test;

public class DivisorTest {

    @Test
    public void test() {
        
        int resultado = 81;
        
        // es divisible por X?
        assertThat(resultado, EsDivisible.esDivisiblePor(2));
        
    }
    
    public static class EsDivisible extends TypeSafeMatcher<Integer> {

        private Integer divisor;
        
        public void describeTo(Description description) {
            description.appendText("Verifica si un numero entero es divisible por otro entero");
        }

        @Override
        protected boolean matchesSafely(Integer dividendo) {
            if(dividendo == null) {
                return false;
            }
            return dividendo % divisor == 0;
        }
        
        public EsDivisible(Integer divisor) {
            this.divisor = divisor;
        }
        
        public static Matcher<Integer> esDivisiblePor(Integer divisor) {
            return new EsDivisible(divisor);
        }
    }
}
