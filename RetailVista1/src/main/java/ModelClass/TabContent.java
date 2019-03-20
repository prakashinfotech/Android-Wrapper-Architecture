package ModelClass;

/**
 * Created by samir
 * on 6/26/2018 6:01 PM.
 */
public class TabContent {
    private String tabName;
    private String tabContent;

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public String getTabContent() {
        return tabContent;
    }

    public void setTabContent(String tabContent) {
        this.tabContent = tabContent;
    }

    public TabContent(String tabName, String tabContent) {
        this.tabName = tabName;
        this.tabContent = tabContent;
    }

}
