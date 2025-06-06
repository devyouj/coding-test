package junyoung.week1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    @DisplayName("약수의 합 테스트")
    @ParameterizedTest
    @CsvSource({
            "12, 28",
            "5, 6",
    })
    void sumDivisor1(int n, int expected) {
        // given
        Solution solution = new Solution();

        // when
        int result = solution.sumDivisor(n);

        // then
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("자릿수 더하기")
    @ParameterizedTest
    @CsvSource({
            "123, 6",
            "987, 24"
    })
    void digitSum(int n, int expected) {
        // given
        Solution solution = new Solution();

        // when
        int result = solution.digitSum(n);

        // then
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("자연수 뒤집기")
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void reverse(long n, int[] expected) {
        //given
        Solution solution = new Solution();

        //when
        int[] result = solution.reverse(n);

        //then
        assertThat(result).isEqualTo(expected);
    }
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(12345L, new int[]{5,4,3,2,1})
        );
    }

}