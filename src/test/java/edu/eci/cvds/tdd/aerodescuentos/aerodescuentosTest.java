package edu.eci.cvds.tdd.aerodescuentos;

import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;
import org.junit.Assert;
import org.junit.Test;

public class aerodescuentosTest {

    //@Test
    //public void validateAgeWithMinusOne() {
        //Assert.assertThrows(IllegalArgumentException.class, () -> CalculadorDescuentos.calculoTarifa(50000, 30, -1));
    //}

    @Test
    public void validateAgeWithZero(){
        double conDescuento = CalculadorDescuentos.calculoTarifa(50000, 10, 0);
        Assert.assertEquals(47500, conDescuento, 0.0001);
    }
    
    @Test
    public void validateAgeWith135(){
        double conDescuento = CalculadorDescuentos.calculoTarifa(50000, 10, 135);
        Assert.assertEquals(46000, conDescuento, 0.0001);
    }
    
    //@Test
    //public void validateAgeWith136(){
        //Assert.assertThrows(IllegalArgumentException.class, () -> CalculadorDescuentos.calculoTarifa(50000, 30, 136));
    //}
    
    @Test
    public void validateAgeWith19(){
        double conDescuento = CalculadorDescuentos.calculoTarifa(50000, 10, 19);
        Assert.assertEquals(50000, conDescuento, 0.0001);
    }
    
    @Test
    public void validateAgeWith21(){
        double conDescuento = CalculadorDescuentos.calculoTarifa(50000, 10, 21);
        Assert.assertEquals(50000, conDescuento, 0.0001);
    }
    
    @Test
    public void validateAgeWith64(){
        double conDescuento = CalculadorDescuentos.calculoTarifa(50000, 10, 64);
        Assert.assertEquals(50000, conDescuento, 0.0001);
    }
    
    @Test
    public void validateAgeWith66(){
        double conDescuento = CalculadorDescuentos.calculoTarifa(50000, 10, 66);
        Assert.assertEquals(46000, conDescuento, 0.0001);
    }
    
    //@Test
    //public void validatePreviousDaysWithMinusOne(){
        //Assert.assertThrows(IllegalArgumentException.class, () -> CalculadorDescuentos.calculoTarifa(50000, -1, 10));
    //}
    
    @Test
    public void validatePreviousDaysWithZero(){
        double conDescuento = CalculadorDescuentos.calculoTarifa(50000, 0, 20);
        Assert.assertEquals(50000, conDescuento, 0.0001);
    }
    
    @Test
    public void validatePreviousDaysWith19(){
        double conDescuento = CalculadorDescuentos.calculoTarifa(50000, 19, 20);
        Assert.assertEquals(50000, conDescuento, 0.0001);
    }
    
    @Test
    public void validatePreviousDaysWith21(){
        double conDescuento = CalculadorDescuentos.calculoTarifa(50000, 21, 20);
        Assert.assertEquals(42500, conDescuento, 0.0001);
    }
    
    //@Test
    //public void validateRateWithMinusOne(){
        //Assert.assertThrows(IllegalArgumentException.class, () -> CalculadorDescuentos.calculoTarifa(-1, 30, 10));
    //}
    
    @Test
    public void validateRateWithZero(){
        double conDescuento = CalculadorDescuentos.calculoTarifa(0, 30, 10);
        Assert.assertEquals(0, conDescuento, 0.0001);
    }
    
    @Test
    public void validateAge17AndPreviousDays21(){
        double conDescuento = CalculadorDescuentos.calculoTarifa(50000, 21, 17);
        Assert.assertEquals(40000, conDescuento, 0.0001);
    }
    
    @Test
    public void validateAge66AndPreviousDays21(){
        double conDescuento = CalculadorDescuentos.calculoTarifa(50000, 66, 17);
        Assert.assertEquals(40000, conDescuento, 0.0001);
    }
}
