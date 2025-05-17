package repositoriesScreen;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

public class CheckRepositoriesFilter extends TestBase {

    @Test(description = "Check Filter Result For C#")
    public void checkFilterResultForC(){
     String ActualResult = new Repositories(driver).clickToRepositories().selectLanguage().selectDate().getActualText();
        Assert.assertEquals(ActualResult, "C");

    }
}
