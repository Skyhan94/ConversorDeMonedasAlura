import java.util.Map;
import com.google.gson.annotations.SerializedName;

public record Moneda(
        @SerializedName("conversion_rates") Map<String, Double> tasaConversion
) {
    public Double getValorMonedaEnDolares(String denominacion) {
        return tasaConversion.get(denominacion);
    }
}
