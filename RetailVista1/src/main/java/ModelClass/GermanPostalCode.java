package ModelClass;

import java.util.List;

/**
 * Created by samir on 2/22/2018.
 */

public class GermanPostalCode {

    /**
     * streets : ["Nieler Straße","Klevestraße"]
     * postcode : 47533
     * place : Kleve
     * district : Kreis Kleve
     * state : Nordrhein-Westfalen
     * _links : {"self":{"href":"https://api.postleitzahlapi.de/v1/postcodes/47533/"}}
     */

    private String postcode;
    private String place;
    private String district;
    private String state;
    private LinksBean _links;
    private List<String> streets;

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LinksBean get_links() {
        return _links;
    }

    public void set_links(LinksBean _links) {
        this._links = _links;
    }

    public List<String> getStreets() {
        return streets;
    }

    public void setStreets(List<String> streets) {
        this.streets = streets;
    }

    public static class LinksBean {
        /**
         * self : {"href":"https://api.postleitzahlapi.de/v1/postcodes/47533/"}
         */

        private SelfBean self;

        public SelfBean getSelf() {
            return self;
        }

        public void setSelf(SelfBean self) {
            this.self = self;
        }

        public static class SelfBean {
            /**
             * href : https://api.postleitzahlapi.de/v1/postcodes/47533/
             */

            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }
    }
}
