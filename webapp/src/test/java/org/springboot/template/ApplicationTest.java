package org.springboot.template;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationTest {

    @Test
    public void main() {
        Application.main(new String[]{});
    }

    @Test
    public void initializeEnvironment() {
        Assertions.assertThat(true).isTrue();
    }
}