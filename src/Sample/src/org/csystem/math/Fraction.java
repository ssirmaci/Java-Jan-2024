/*

>**Sınıf Çalışması:** Bir kesri temsil eden Fraction isimli sınıfı aşağıdaki açıklamalara göre yazınız
>
>**Açıklamalar:**
>- Sınıf Matematikteki bir kesri temsil ettiğinden pay (numerator) ve payda (denominator) değerleri tutulacaktır.
>- Sınıfın ilgili set ve get metotları yazılacaktır.
>- Pay'ın sıfırdan farklı veya sıfır ve paydanın sıfır olması durumunda uygun mesajla birlikte program sonlandırılacaktır.
>- Kesir her durumda sadeleşmiş bir biçimde tutulacaktır. Örneğin kesrin pay ve paydası sırasıyla 4 ve 18 olarak verildiğinde kesir 2 / 9 olarak tutulacaktır.
>- Kesir negatif ise işaret payda bulunacaktır. Örneğin kesrin pay ve paydası sırasıyla 3 ve -4 olarak verilmişse  kesir -3 / 4 biçiminde tutulacaktır.
>- Kesrin pay ve paydasının her ikisinin birden negatif olması durumunda kesir pozitif olarak tutulacaktır.
>- Kesrin payının sıfır olması durumunda payda ne olursa olsun 1(bir) yapılacaktır.
>- Sınıfın iki kesri toplayan, bir kesir ile bir tamsayıyı toplayan metotları olacaktır. Aynı işlemler çıkarma, çarpma ve bölme için de yapılacaktır.
>- Sınıfın kesri 1(bir) artıran ve bir azaltan inc ve dec metotları yazılacaktır.
>- Sınıfın toString metodu şu formatta yazı döndürecek şekilde override edilecektir. Örneğin 3 / 10 kesri için -> 3 / 10 = 3.333333    10 / 1 kesri için -> 10 Ondalık kısımda 6 basamak gösterilecektir. Geri kalan basamaklar yuvarlanacaktır.
>- Sınıfın equals metodu iki kesrin eşitlik karşılaştırması için override edilecektir.
>- Sınıfın default ctor'u "0 / 1" kesrini temsil eden nesneyi yaratmak için kullanılabilecektir. Sınıfın compareTo metodu iki kesrin büyüklük küçüklük karşılaştırmasını yapacaktır. String sınıfının compareTo metodunun mantığına göre tasarlayınız.
>- Kesrin double türden ondalık değerini döndüren getRealValue metodu yazılacaktır.
>- Sınıfın public bölümünü değiştirmeden istediğiniz değişikliği ve eklemeleri yapabilirsiniz.
>- Sınıfın public bölümü ile birlikte iskeleti şu şekildedir:

```java
package org.csystem.math;

public class Fraction {
     public Fraction()
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public Fraction(int a)
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public Fraction(int a, int b)
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public int getNumerator()
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public void setNumerator(int val)
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public int getDenominator()
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public void setDenominator(int val)
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public double getRealValue()
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public Fraction add(Fraction other)
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public Fraction add(int val)
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public Fraction subtract(Fraction other)
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public Fraction subtract(int val)
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public Fraction multiply(Fraction other)
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public Fraction multiply(int val)
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public Fraction divide(Fraction other)
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public Fraction divide(int val)
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public void inc()
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public void dec()
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public int compareTo(Fraction other)
     {
         throw new UnsupportedOperationException("TODO:");
     }

     public boolean equals()
     {
        throw new UnsupportedOperationException("TODO:");
     }

     public String toString()
     {
         throw new UnsupportedOperationException("TODO:");
     }
}
```

*/


/**
 * Fraction class that represents fraction
 * Last Update: 28th March 2025
 * @author Java-Jan-2024 Group
 */

package org.csystem.math;

public class Fraction {
    private int m_a;
    private int m_b;
    static final double DELTA = 0.000001;

    private static int ebob(int a, int b) {
        return b == 0 ? Math.abs(a) : ebob(b, a % b);
    }

    private void simplfy() {
        int ebobValue = ebob(m_a, m_b);
        m_a /= ebobValue;
        m_b /= ebobValue;

        if(m_b < 0) {
            m_a = -m_a;
            m_b = -m_b;
        }
    }

    public Fraction()
    {
        this(0,1);
    }

    public Fraction(int a)
    {
        this(a,1);
    }

    public Fraction(int a, int b)
    {
        if(b == 0) {
            System.out.println("Payda 0 olması nedeniyle, program sonlandırılıyor...");
            System.exit(1);
        }

        if(a == 0)
            b = 1;

        m_a = a;
        m_b = b;

        simplfy();

    }

    public int getNumerator()
    {
        return m_a;
    }

    public void setNumerator(int val)
    {
        m_a = val;
        simplfy();
    }

    public int getDenominator()
    {
        return m_b;
    }

    public void setDenominator(int val)
    {
        if(val == 0) {
            System.out.println("Payda 0 olması nedeniyle, program sonlandırılıyor...");
            System.exit(1);
        }
        m_b = val;
        simplfy();
    }

    public double getRealValue()
    {
        return (double)m_a/m_b;

    }

    public Fraction add(Fraction other)
    {
        return new Fraction((this.m_a * other.m_b) + (other.m_a * this.m_b),this.m_b * other.m_b );

    }

    public Fraction add(int val)
    {
        return new Fraction(this.m_a + (val * this.m_b),this.m_b);

    }

    public Fraction subtract(Fraction other)
    {
        return new Fraction((this.m_a * other.m_b) - (other.m_a * this.m_b), this.m_b * other.m_b);

    }

    public Fraction subtract(int val)
    {
        Fraction other = new Fraction();
        other.m_a = val * this.m_b;
        return new Fraction(this.m_a - other.m_a, this.m_b);

    }


    public Fraction multiply(Fraction other)
    {
        return new Fraction(this.m_a * other.m_a, this.m_b * other.m_b);

    }

    public Fraction multiply(int val)
    {
        return new Fraction(this.m_a * val,this.m_b);

    }

    public Fraction divide(Fraction other)
    {
        int i = other.m_a;
        other.m_a = other.m_b;
        other.m_b = i;

        return this.multiply(other);

    }

    public Fraction divide(int val)
    {
        Fraction other = new Fraction(this.m_b,val * this.m_b );

        return this.multiply(other);
    }

    public void inc()
    {
        Fraction add = this.add(1);
        this.m_a= add.m_a;
        this.m_b= add.m_b;
    }

    public void dec()
    {
        Fraction add = this.subtract(1);
        this.m_a= add.m_a;
        this.m_b= add.m_b;
    }

    public int compareTo(Fraction other)
    {

        return Integer.compare(this.m_a * other.m_b, other.m_a * this.m_b);
    }

    public boolean equals(Fraction other)
    {
        return other instanceof Fraction && Math.abs(this.m_a - other.m_a) < DELTA && Math.abs(this.m_b - other.m_b) < DELTA;
    }

    public String toString()
    {
        return "%d / %d kesri için -> %d/%d = %.6f".formatted(m_a, m_b, m_a, m_b, getRealValue());
    }
}