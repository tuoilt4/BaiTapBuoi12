package omg;
import org.assertj.core.api.AbstractIntegerAssert;
import org.junit.Test;

import java.util.Scanner;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

public class BaiTapBuoi12 {
    @Test
    public void KtEmail()
    {
        String so = "0lethituoi@gmail.com";
        assertThat(so).containsOnlyOnce("@")
                .isNotEmpty()
                .doesNotContain("..")
                .doesNotStartWith("@")
                .doesNotEndWith("@")
                .containsPattern("[a-zA-Z0-9][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");
    }
    @Test
    public void KtCnang() {
        String cn = "65";
        assertThat(cn).containsOnlyDigits();
//        assertThat(cn).containsPattern("\d");
//        assertThat(cn).containsPattern("\d{1,3}\\.\\\d{1,}");
        double cannang = Double.parseDouble(cn);
        assertThat(cannang).isNotZero();
        assertThat(cannang).isNotNull();
        assertThat(cannang).isStrictlyBetween(0.0, 200.0);
    }

    @Test
    public void ktcmt() {
        String cmt []= {"123456780", "123456787","123456788","123456789","a23456785"};
        assertThat(cmt).isNotEmpty();
        assertThat(cmt).isNotNull();
        assertThat(cmt).hasSize(5);
        for (int i =0;i< cmt.length;i++) {
            assertThat(cmt[i]).hasSize(9);
            assertThat(cmt[i]).isNotEmpty();
            assertThat(cmt[i]).containsOnlyDigits();
        }

    }

}
