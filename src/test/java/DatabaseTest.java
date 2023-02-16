import org.junit.Assert;
import org.junit.Test;
import praktikum.Database;

public class DatabaseTest{
    Database database = new Database();

    @Test
    public void checkBunSizeIsGreaterThanZero() {
        Assert.assertNotEquals("buns > 0", 0,database.availableBuns().size());
    }

    @Test
    public void checkIngredientsSizeIsGreaterThanZero() {
        Assert.assertNotEquals("ingredient > 0", 0,database.availableIngredients().size());
    }
}