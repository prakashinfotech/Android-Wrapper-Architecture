package ModelClass;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Vivek on 9/8/2017.
 */

public class PostCode {


    /**
     * _embedded : {"addresses":[{"purpose":"kantoorfunctie","postcode":"5038EA","surface":974,"municipality":{"id":"0855","label":"Tilburg"},"city":{"id":"1043","label":"Tilburg"},"letter":null,"geo":{"center":{"rd":{"type":"Point","coordinates":[133867.521,396725.441],"crs":{"type":"name","properties":{"name":"urn:ogc:def:crs:EPSG::28992"}}},"wgs84":{"type":"Point","coordinates":[5.0824628,51.5590797],"crs":{"type":"name","properties":{"name":"urn:ogc:def:crs:OGC:1.3:CRS84"}}}}},"nen5825":{"postcode":"5038 EA","street":"STATIONSSTRAAT"},"addition":null,"number":19,"year":1883,"province":{"id":"30","label":"Noord-Brabant"},"id":"0855200000046364","type":"Verblijfsobject","street":"Stationsstraat","_links":{"self":{"href":"https://api.postcodeapi.nu/v2/addresses/0855200000046364/"}}}]}
     * _links : {"self":{"href":"https://api.postcodeapi.nu/v2/addresses/?postcode=5038EA&number=19"}}
     */

    @SerializedName("_embedded")
    private EmbeddedBean embedded;
    @SerializedName("_links")
    private LinksBeanX links;

    public EmbeddedBean getEmbedded() {
        return embedded;
    }

    public void setEmbedded(EmbeddedBean embedded) {
        this.embedded = embedded;
    }

    public LinksBeanX getLinks() {
        return links;
    }

    public void setLinks(LinksBeanX links) {
        this.links = links;
    }

    public static class EmbeddedBean {
        @SerializedName("addresses")
        private List<AddressesBean> addresses;

        public List<AddressesBean> getAddresses() {
            return addresses;
        }

        public void setAddresses(List<AddressesBean> addresses) {
            this.addresses = addresses;
        }

        public static class AddressesBean {
            /**
             * purpose : kantoorfunctie
             * postcode : 5038EA
             * surface : 974
             * municipality : {"id":"0855","label":"Tilburg"}
             * city : {"id":"1043","label":"Tilburg"}
             * letter : null
             * geo : {"center":{"rd":{"type":"Point","coordinates":[133867.521,396725.441],"crs":{"type":"name","properties":{"name":"urn:ogc:def:crs:EPSG::28992"}}},"wgs84":{"type":"Point","coordinates":[5.0824628,51.5590797],"crs":{"type":"name","properties":{"name":"urn:ogc:def:crs:OGC:1.3:CRS84"}}}}}
             * nen5825 : {"postcode":"5038 EA","street":"STATIONSSTRAAT"}
             * addition : null
             * number : 19
             * year : 1883
             * province : {"id":"30","label":"Noord-Brabant"}
             * id : 0855200000046364
             * type : Verblijfsobject
             * street : Stationsstraat
             * _links : {"self":{"href":"https://api.postcodeapi.nu/v2/addresses/0855200000046364/"}}
             */

            @SerializedName("purpose")
            private String purpose;
            @SerializedName("postcode")
            private String postcode;
            @SerializedName("surface")
            private int surface;
            @SerializedName("municipality")
            private MunicipalityBean municipality;
            @SerializedName("city")
            private CityBean city;
            @SerializedName("letter")
            private Object letter;
            @SerializedName("geo")
            private GeoBean geo;
            @SerializedName("nen5825")
            private Nen5825Bean nen5825;
            @SerializedName("addition")
            private Object addition;
            @SerializedName("number")
            private int number;
            @SerializedName("year")
            private int year;
            @SerializedName("province")
            private ProvinceBean province;
            @SerializedName("id")
            private String id;
            @SerializedName("type")
            private String type;
            @SerializedName("street")
            private String street;
            @SerializedName("_links")
            private LinksBean links;

            public String getPurpose() {
                return purpose;
            }

            public void setPurpose(String purpose) {
                this.purpose = purpose;
            }

            public String getPostcode() {
                return postcode;
            }

            public void setPostcode(String postcode) {
                this.postcode = postcode;
            }

            public int getSurface() {
                return surface;
            }

            public void setSurface(int surface) {
                this.surface = surface;
            }

            public MunicipalityBean getMunicipality() {
                return municipality;
            }

            public void setMunicipality(MunicipalityBean municipality) {
                this.municipality = municipality;
            }

            public CityBean getCity() {
                return city;
            }

            public void setCity(CityBean city) {
                this.city = city;
            }

            public Object getLetter() {
                return letter;
            }

            public void setLetter(Object letter) {
                this.letter = letter;
            }

            public GeoBean getGeo() {
                return geo;
            }

            public void setGeo(GeoBean geo) {
                this.geo = geo;
            }

            public Nen5825Bean getNen5825() {
                return nen5825;
            }

            public void setNen5825(Nen5825Bean nen5825) {
                this.nen5825 = nen5825;
            }

            public Object getAddition() {
                return addition;
            }

            public void setAddition(Object addition) {
                this.addition = addition;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }

            public ProvinceBean getProvince() {
                return province;
            }

            public void setProvince(ProvinceBean province) {
                this.province = province;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getStreet() {
                return street;
            }

            public void setStreet(String street) {
                this.street = street;
            }

            public LinksBean getLinks() {
                return links;
            }

            public void setLinks(LinksBean links) {
                this.links = links;
            }

            public static class MunicipalityBean {
                /**
                 * id : 0855
                 * label : Tilburg
                 */

                @SerializedName("id")
                private String id;
                @SerializedName("label")
                private String label;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getLabel() {
                    return label;
                }

                public void setLabel(String label) {
                    this.label = label;
                }
            }

            public static class CityBean {
                /**
                 * id : 1043
                 * label : Tilburg
                 */

                @SerializedName("id")
                private String id;
                @SerializedName("label")
                private String label;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getLabel() {
                    return label;
                }

                public void setLabel(String label) {
                    this.label = label;
                }
            }

            public static class GeoBean {
                /**
                 * center : {"rd":{"type":"Point","coordinates":[133867.521,396725.441],"crs":{"type":"name","properties":{"name":"urn:ogc:def:crs:EPSG::28992"}}},"wgs84":{"type":"Point","coordinates":[5.0824628,51.5590797],"crs":{"type":"name","properties":{"name":"urn:ogc:def:crs:OGC:1.3:CRS84"}}}}
                 */

                @SerializedName("center")
                private CenterBean center;

                public CenterBean getCenter() {
                    return center;
                }

                public void setCenter(CenterBean center) {
                    this.center = center;
                }

                public static class CenterBean {
                    /**
                     * rd : {"type":"Point","coordinates":[133867.521,396725.441],"crs":{"type":"name","properties":{"name":"urn:ogc:def:crs:EPSG::28992"}}}
                     * wgs84 : {"type":"Point","coordinates":[5.0824628,51.5590797],"crs":{"type":"name","properties":{"name":"urn:ogc:def:crs:OGC:1.3:CRS84"}}}
                     */

                    @SerializedName("rd")
                    private RdBean rd;
                    @SerializedName("wgs84")
                    private Wgs84Bean wgs84;

                    public RdBean getRd() {
                        return rd;
                    }

                    public void setRd(RdBean rd) {
                        this.rd = rd;
                    }

                    public Wgs84Bean getWgs84() {
                        return wgs84;
                    }

                    public void setWgs84(Wgs84Bean wgs84) {
                        this.wgs84 = wgs84;
                    }

                    public static class RdBean {
                        /**
                         * type : Point
                         * coordinates : [133867.521,396725.441]
                         * crs : {"type":"name","properties":{"name":"urn:ogc:def:crs:EPSG::28992"}}
                         */

                        @SerializedName("type")
                        private String type;
                        @SerializedName("crs")
                        private CrsBean crs;
                        @SerializedName("coordinates")
                        private List<Double> coordinates;

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public CrsBean getCrs() {
                            return crs;
                        }

                        public void setCrs(CrsBean crs) {
                            this.crs = crs;
                        }

                        public List<Double> getCoordinates() {
                            return coordinates;
                        }

                        public void setCoordinates(List<Double> coordinates) {
                            this.coordinates = coordinates;
                        }

                        public static class CrsBean {
                            /**
                             * type : name
                             * properties : {"name":"urn:ogc:def:crs:EPSG::28992"}
                             */

                            @SerializedName("type")
                            private String type;
                            @SerializedName("properties")
                            private PropertiesBean properties;

                            public String getType() {
                                return type;
                            }

                            public void setType(String type) {
                                this.type = type;
                            }

                            public PropertiesBean getProperties() {
                                return properties;
                            }

                            public void setProperties(PropertiesBean properties) {
                                this.properties = properties;
                            }

                            public static class PropertiesBean {
                                /**
                                 * name : urn:ogc:def:crs:EPSG::28992
                                 */

                                @SerializedName("name")
                                private String name;

                                public String getName() {
                                    return name;
                                }

                                public void setName(String name) {
                                    this.name = name;
                                }
                            }
                        }
                    }

                    public static class Wgs84Bean {
                        /**
                         * type : Point
                         * coordinates : [5.0824628,51.5590797]
                         * crs : {"type":"name","properties":{"name":"urn:ogc:def:crs:OGC:1.3:CRS84"}}
                         */

                        @SerializedName("type")
                        private String type;
                        @SerializedName("crs")
                        private CrsBeanX crs;
                        @SerializedName("coordinates")
                        private List<Double> coordinates;

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public CrsBeanX getCrs() {
                            return crs;
                        }

                        public void setCrs(CrsBeanX crs) {
                            this.crs = crs;
                        }

                        public List<Double> getCoordinates() {
                            return coordinates;
                        }

                        public void setCoordinates(List<Double> coordinates) {
                            this.coordinates = coordinates;
                        }

                        public static class CrsBeanX {
                            /**
                             * type : name
                             * properties : {"name":"urn:ogc:def:crs:OGC:1.3:CRS84"}
                             */

                            @SerializedName("type")
                            private String type;
                            @SerializedName("properties")
                            private PropertiesBeanX properties;

                            public String getType() {
                                return type;
                            }

                            public void setType(String type) {
                                this.type = type;
                            }

                            public PropertiesBeanX getProperties() {
                                return properties;
                            }

                            public void setProperties(PropertiesBeanX properties) {
                                this.properties = properties;
                            }

                            public static class PropertiesBeanX {
                                /**
                                 * name : urn:ogc:def:crs:OGC:1.3:CRS84
                                 */

                                @SerializedName("name")
                                private String name;

                                public String getName() {
                                    return name;
                                }

                                public void setName(String name) {
                                    this.name = name;
                                }
                            }
                        }
                    }
                }
            }

            public static class Nen5825Bean {
                /**
                 * postcode : 5038 EA
                 * street : STATIONSSTRAAT
                 */

                @SerializedName("postcode")
                private String postcode;
                @SerializedName("street")
                private String street;

                public String getPostcode() {
                    return postcode;
                }

                public void setPostcode(String postcode) {
                    this.postcode = postcode;
                }

                public String getStreet() {
                    return street;
                }

                public void setStreet(String street) {
                    this.street = street;
                }
            }

            public static class ProvinceBean {
                /**
                 * id : 30
                 * label : Noord-Brabant
                 */

                @SerializedName("id")
                private String id;
                @SerializedName("label")
                private String label;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getLabel() {
                    return label;
                }

                public void setLabel(String label) {
                    this.label = label;
                }
            }

            public static class LinksBean {
                /**
                 * self : {"href":"https://api.postcodeapi.nu/v2/addresses/0855200000046364/"}
                 */

                @SerializedName("self")
                private SelfBean self;

                public SelfBean getSelf() {
                    return self;
                }

                public void setSelf(SelfBean self) {
                    this.self = self;
                }

                public static class SelfBean {
                    /**
                     * href : https://api.postcodeapi.nu/v2/addresses/0855200000046364/
                     */

                    @SerializedName("href")
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
    }

    public static class LinksBeanX {
        /**
         * self : {"href":"https://api.postcodeapi.nu/v2/addresses/?postcode=5038EA&number=19"}
         */

        @SerializedName("self")
        private SelfBeanX self;

        public SelfBeanX getSelf() {
            return self;
        }

        public void setSelf(SelfBeanX self) {
            this.self = self;
        }

        public static class SelfBeanX {
            /**
             * href : https://api.postcodeapi.nu/v2/addresses/?postcode=5038EA&number=19
             */

            @SerializedName("href")
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
