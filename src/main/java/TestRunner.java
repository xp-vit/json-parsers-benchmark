import io.gatling.jsonbenchmark.serialization.KryoJavaSerialization;
import io.gatling.jsonbenchmark.serialization.MainJacksonSerializer;
import io.gatling.jsonbenchmark.serialization.RegularJavaSerialization;
import org.openjdk.jmh.profile.ProfilerType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class TestRunner {

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(".*" + RegularJavaSerialization.class.getSimpleName() + ".*")
                .include(".*" + MainJacksonSerializer.class.getSimpleName() + ".*")
                /*.include(".*" + KryoJavaSerialization.class.getSimpleName() + ".*")*/
                .forks(1)
                .threads(1)
                .warmupIterations(20)
                .measurementIterations(35)
                .build();

        new Runner(opt).run();
    }
}


