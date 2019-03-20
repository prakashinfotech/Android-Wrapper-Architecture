package ModelClass.ResponseClass;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * Created by samir on 8/11/2017.
 */

public class ProductOfferResponse {


    /**
     * products : {"product":[{"minimum":20.96,"name":"Weber 8413","ean":77924007637,"offers":{"offer":[{"price":20.96,"seller":"BBQ-Kookshop"},{"price":21.16,"seller":"Warentuin"},{"price":21.95,"seller":"Obelink.nl"},{"price":24.99,"seller":"Weber Grill"},{"price":24.99,"seller":"kampeerperfect.nl"},{"price":24.99,"seller":"kampeergoed.nl"},{"price":24.99,"seller":"vtwonen.nl"},{"price":24.99,"seller":"Vrijbuiter NL"},{"price":24.99,"seller":"OO Shopping"},{"price":24.99,"seller":"FonQ.nl"}]},"average":25.44},{"minimum":239,"name":"Q 1200 Black Gasbarbecue","ean":77924026706,"offers":{"offer":[{"price":239,"seller":"Van Rossum IJzerhandel"},{"price":239,"seller":"BBQ-Kookshop"},{"price":239.55,"seller":"Allesvoorbbq.nl"},{"price":239.55,"seller":"Barbecueshop.nl"},{"price":241.2,"seller":"Coolblue.nl"},{"price":246.75,"seller":"Tuincentrum Osdorp"},{"price":249,"seller":"Cook&Co.nl"},{"price":249.99,"seller":"Vrijbuiter NL"},{"price":258.95,"seller":"vtwonen.nl"},{"price":279.65,"seller":"Warentuin"}]},"average":264.66},{"minimum":52.5,"name":"Weber Luxe Hoes 57 cm","ean":77924031939,"offers":{"offer":[{"price":52.5,"seller":"vtwonen.nl"},{"price":57.99,"seller":"Coolblue"},{"price":57.99,"seller":"Cook&Co"},{"price":59.41,"seller":"Warentuin"},{"price":59.99,"seller":"Kampeerwereld.nl"},{"price":62.95,"seller":"Obelink.nl"},{"price":64.9,"seller":"Alternate.nl"},{"price":64.95,"seller":"Vivolanda.nl"},{"price":64.95,"seller":"De Boet"},{"price":64.99,"seller":"Meesterslijpers.nl"}]},"average":65.7},{"minimum":372.35,"name":"Weber Q 2200","ean":77924033872,"offers":{"offer":[{"price":372.35,"seller":"Barbecueshop.nl"},{"price":372.35,"seller":"AllesvoorBBQ.nl"},{"price":372.35,"seller":"Cook&Co"},{"price":449,"seller":"Obelink.nl"},{"price":449,"seller":"Bax Totaalrecreatie"},{"price":449.99,"seller":"Vrijbuiter NL"},{"price":469,"seller":"Coppens Tuinmeubelen"},{"price":499,"seller":"OO Shopping"},{"price":499,"seller":"karwei.nl"},{"price":499,"seller":"Tuinland"}]},"average":448.19}]}
     */

    private ProductsBean products;

    public ProductsBean getProducts() {
        return products;
    }

    public void setProducts(ProductsBean products) {
        this.products = products;
    }

    public static class ProductsBean {
        private List<ProductBean> product;

        public List<ProductBean> getProduct() {
            return product;
        }

        public void setProduct(List<ProductBean> product) {
            this.product = product;
        }

        public static class ProductBean {
            /**
             * minimum : 20.96
             * name : Weber 8413
             * ean : 77924007637
             * offers : {"offer":[{"price":20.96,"seller":"BBQ-Kookshop"},{"price":21.16,"seller":"Warentuin"},{"price":21.95,"seller":"Obelink.nl"},{"price":24.99,"seller":"Weber Grill"},{"price":24.99,"seller":"kampeerperfect.nl"},{"price":24.99,"seller":"kampeergoed.nl"},{"price":24.99,"seller":"vtwonen.nl"},{"price":24.99,"seller":"Vrijbuiter NL"},{"price":24.99,"seller":"OO Shopping"},{"price":24.99,"seller":"FonQ.nl"}]}
             * average : 25.44
             */

            private double minimum;
            private String name;
            private long ean;
            @SerializedName("own-price")
            private double own_price;
            @SerializedName("purchase-price")
            private double purchase_price;
            @SerializedName("recommended-price")
            private double recommended_price;

            public double getOwn_price() {
                return own_price;
            }

            public void setOwn_price(double own_price) {
                this.own_price = own_price;
            }

            public double getPurchase_price() {
                return purchase_price;
            }

            public void setPurchase_price(double purchase_price) {
                this.purchase_price = purchase_price;
            }

            public double getRecommended_price() {
                return recommended_price;
            }

            public void setRecommended_price(double recommended_price) {
                this.recommended_price = recommended_price;
            }

            private OffersBean offers;
            private double average;

            public double getMinimum() {
                return minimum;
            }

            public void setMinimum(double minimum) {
                this.minimum = minimum;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public long getEan() {
                return ean;
            }

            public void setEan(long ean) {
                this.ean = ean;
            }

            public OffersBean getOffers() {
                return offers;
            }

            public void setOffers(OffersBean offers) {
                this.offers = offers;
            }

            public double getAverage() {
                return average;
            }

            public void setAverage(double average) {
                this.average = average;
            }

            public static class OffersBean {
                private List<OfferBean> offer;

                public List<OfferBean> getOffer() {
                    return offer;
                }

                public void setOffer(List<OfferBean> offer) {
                    this.offer = offer;
                }

                public static class OfferBean {
                    /**
                     * price : 20.96
                     * seller : BBQ-Kookshop
                     */

                    private double price;
                    private String seller;

                    public double getPrice() {
                        return price;
                    }

                    public void setPrice(double price) {
                        this.price = price;
                    }

                    public String getSeller() {
                        return seller;
                    }

                    public void setSeller(String seller) {
                        this.seller = seller;
                    }
                }
            }
        }
    }
}
