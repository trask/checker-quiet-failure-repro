import com.google.common.base.Function;
import org.checkerframework.checker.nullness.qual.Nullable;

class Test implements Function<String, String> {

    @Override
    public String apply(@Nullable String obj) {
        return "";
    }
}
