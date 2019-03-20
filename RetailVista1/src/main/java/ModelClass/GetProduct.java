package ModelClass;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by haresh on 7/17/2017.
 */

public class GetProduct {


    private GetProductsResultBean GetProductsResult;
    private String xmlns;

    public GetProductsResultBean getGetProductsResult() {
        return GetProductsResult;
    }

    public void setGetProductsResult(GetProductsResultBean GetProductsResult) {
        this.GetProductsResult = GetProductsResult;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public static class GetProductsResultBean {
        private List<ViewProductInfoBean> ViewProductInfo;

        public List<ViewProductInfoBean> getViewProductInfo() {
            return ViewProductInfo;
        }

        public void setViewProductInfo(List<ViewProductInfoBean> ViewProductInfo) {
            this.ViewProductInfo = ViewProductInfo;
        }

        public static class ViewProductInfoBean {


            private int PurchaseUnitToPurchaseContentUnitFactor;
            private String ClassificationLevel1Code;
            private int OldItemId;
            private int FreeTableId;
            private int CalculatedMinStock;
            private long MainBarcode;
            private String ClassificationLevel2Code;
            private String RelatedProductsType;
            private String LastModifiedDateTime;
            private int VatId;
            private int ConsumerUnitToSaleUnitFactor;
            private float AppliedGrossPrice;
            private boolean IsPurchaseAvailable;
            private float GrossPrice;
            private boolean IsConsignmentProduct;
            private int LabelClassId;
            private int Plu;
            private String Description;
            private String ProductState;
            private boolean IsNoSavings;
            private OpenReservationsBean OpenReservations;
            private int CalculatedMaxStock;
            private int CashRegisterGroupCode;
            private int SubBrandId;
            private int LastModifiedByUserId;
            private String CreatedDateTime;
            private boolean IsNoQuantityPriceBreakDiscount;
            private int WarrantyId;
            private int SaleUnitDimensionId;
            private String ProductCategoryDescription;
            private int ParentProductId;
            private boolean IsCancelled;
            private int WebshopProductItemId;
            private PurchasePriceBean PurchasePrice;
            private String PreferredSupplierName;
            private int PreferredSupplierId;
            private int GiftCardTypeId;
            private boolean DoesMaintainStock;
            private boolean IsNoDiscounts;
            private FreeStockBean FreeStock;
            private int DefaultSaleAmount;
            private String ClassificationLevel2Description;
            private int ProductCategoryId;
            private boolean IsAskForPriceInPos;
            private String LastExchangeDateTime;
            private boolean IsMaintainStock;
            private int AssortmentCode;
            private int ProductCombinationGroupId;
            private boolean IsProductGroup;
            private boolean IsPriceZeroAllowed;
            private int LocationClassId;
            private int ContentIsoDimensionId;
            private int OrganizationProductNumber;
            private int CompanyId;
            private MarginBean Margin;
            private String FormattedDescription;
            private StoreTypeGrossPriceBean StoreTypeGrossPrice;
            private int PosMessageId;
            private int ItemId;
            private boolean IsKitchenArticle;
            private int ParentProductNumber;
            private MinimumStockBean MinimumStock;
            private int SizeIsoDimensionIdPackage;
            private boolean ProductPosMessageFound;
            private int PreferredSupplierNumber;
            private boolean IsNoDiscountOnDiscount;
            private boolean IsNoMixedMatchDiscount;
            private int CashRegisterGroupId;
            private int DefaultDeliveryDays;
            private String AssortmentDescription;
            private String ClassificationLevel3Description;
            private int BarcodeTypeId;
            private String OrderMethod;
            private int ProductNumber;
            private LengthArticleBean LengthArticle;
            private boolean IsPriceBlocked;
            private int SaleUnitPackageId;
            private int ClassificationLevel4Id;
            private int ClassificationLevel3Id;
            private FutureStockBean FutureStock;
            private int TransportClassId;
            private int SizeId;
            private int ClassificationLevel2Id;
            private NetWeightBean NetWeight;
            private LengthPackageBean LengthPackage;
            private int BrandId;
            private int OrderMultiplier;
            private int SizeIsoDimensionIdArticle;
            private boolean IsAllowMultiplePricing;
            private StockBean Stock;
            private int ClassificationLevel5Id;
            private boolean IsTrackAndTraceProduct;
            private int SaleLedgerId;
            private WidthArticleBean WidthArticle;
            private boolean PrintLabel;
            private AllowanceAmountBean AllowanceAmount;
            private String CashRegisterGroupShortDescription;
            private OwnPurchasePriceBean OwnPurchasePrice;
            private MarginPercentageBean MarginPercentage;
            private boolean IsCollection;
            private int ClassificationLevel1Id;
            private int WebshopClassificationId;
            private DepthArticleBean DepthArticle;
            private OpenSaleOrdersBean OpenSaleOrders;
            private boolean IsScaleIntegration;
            private int SizeTypeId;
            private int CreatedByUserId;
            private float PurchasePricePerAmount;
            private int AssortmentId;
            private boolean IsAskForDescriptionInPos;
            private StoreGrossPriceBean StoreGrossPrice;
            private boolean IsSerialAdministration;
            private GrossPurchasePriceReductionPercentageBean GrossPurchasePriceReductionPercentage;
            private int DefaultWebshopClassificationId;
            private boolean IsDerived;
            private boolean IsAllowPriceModification;
            private int ClassificationLevel3Code;
            private boolean IsGiftCard;
            private boolean VatRequired;
            private MaximumStockBean MaximumStock;
            private int VatPercentage;
            private GrossWeightBean GrossWeight;
            private int ColorId;
            private String CashRegisterGroupDescription;
            private int ProductCategoryCode;
            private int ReplacementProductId;
            private boolean IsIncludeInStockValue;
            private NetContentBean NetContent;
            private int ArticleGroupId;
            private String ClassificationLevel1Description;
            private boolean IsAllowDiscountPercentageModification;
            private OpenPurchaseOrdersBean OpenPurchaseOrders;
            private int ContentIsoPackageId;
            private int WeightIsoDimensionId;
            private int DisposalFeeId;
            private DepthPackageBean DepthPackage;
            private String MarkingCodeType;
            private HeightArticleBean HeightArticle;
            private boolean IsNoDiscountAgreementDiscount;
            private int OrganizationId;
            private int MinimumOrderQuantity;
            private boolean IsAskForAmountInPos;
            private boolean ManualMinMaxStock;
            private WidthPackageBean WidthPackage;
            private int ExternalProductId;
            private GrossPurchasePriceBean GrossPurchasePrice;
            private AdvicePriceBean AdvicePrice;
            private HeightPackageBean HeightPackage;
            private int FollowupNumber;
            private boolean IsSale;
            private String SearchText;
            private String SaleUnitPackageDescription;
            private String SaleUnitPackageShortDescription;
            private String PurchaseStatusRowDescription;
            private String ExchangeRemarks;
            private int PurchaseStatusRowCode;
            private String OrderCode;
            private String BrandDescription;
            private int BrandCode;
            private String Note2;
            private String Note1;
            private int CbsCode;

            public int getPurchaseUnitToPurchaseContentUnitFactor() {
                return PurchaseUnitToPurchaseContentUnitFactor;
            }

            public void setPurchaseUnitToPurchaseContentUnitFactor(int PurchaseUnitToPurchaseContentUnitFactor) {
                this.PurchaseUnitToPurchaseContentUnitFactor = PurchaseUnitToPurchaseContentUnitFactor;
            }

            public String getClassificationLevel1Code() {
                return ClassificationLevel1Code;
            }

            public void setClassificationLevel1Code(String ClassificationLevel1Code) {
                this.ClassificationLevel1Code = ClassificationLevel1Code;
            }

            public int getOldItemId() {
                return OldItemId;
            }

            public void setOldItemId(int OldItemId) {
                this.OldItemId = OldItemId;
            }

            public int getFreeTableId() {
                return FreeTableId;
            }

            public void setFreeTableId(int FreeTableId) {
                this.FreeTableId = FreeTableId;
            }

            public int getCalculatedMinStock() {
                return CalculatedMinStock;
            }

            public void setCalculatedMinStock(int CalculatedMinStock) {
                this.CalculatedMinStock = CalculatedMinStock;
            }

            public long getMainBarcode() {
                return MainBarcode;
            }

            public void setMainBarcode(long MainBarcode) {
                this.MainBarcode = MainBarcode;
            }

            public String getClassificationLevel2Code() {
                return ClassificationLevel2Code;
            }

            public void setClassificationLevel2Code(String ClassificationLevel2Code) {
                this.ClassificationLevel2Code = ClassificationLevel2Code;
            }

            public String getRelatedProductsType() {
                return RelatedProductsType;
            }

            public void setRelatedProductsType(String RelatedProductsType) {
                this.RelatedProductsType = RelatedProductsType;
            }

            public String getLastModifiedDateTime() {
                return LastModifiedDateTime;
            }

            public void setLastModifiedDateTime(String LastModifiedDateTime) {
                this.LastModifiedDateTime = LastModifiedDateTime;
            }

            public int getVatId() {
                return VatId;
            }

            public void setVatId(int VatId) {
                this.VatId = VatId;
            }

            public int getConsumerUnitToSaleUnitFactor() {
                return ConsumerUnitToSaleUnitFactor;
            }

            public void setConsumerUnitToSaleUnitFactor(int ConsumerUnitToSaleUnitFactor) {
                this.ConsumerUnitToSaleUnitFactor = ConsumerUnitToSaleUnitFactor;
            }

            public float getAppliedGrossPrice() {
                return AppliedGrossPrice;
            }

            public void setAppliedGrossPrice(int AppliedGrossPrice) {
                this.AppliedGrossPrice = AppliedGrossPrice;
            }

            public boolean isIsPurchaseAvailable() {
                return IsPurchaseAvailable;
            }

            public void setIsPurchaseAvailable(boolean IsPurchaseAvailable) {
                this.IsPurchaseAvailable = IsPurchaseAvailable;
            }

            public float getGrossPrice() {
                return GrossPrice;
            }

            public void setGrossPrice(int GrossPrice) {
                this.GrossPrice = GrossPrice;
            }

            public boolean isIsConsignmentProduct() {
                return IsConsignmentProduct;
            }

            public void setIsConsignmentProduct(boolean IsConsignmentProduct) {
                this.IsConsignmentProduct = IsConsignmentProduct;
            }

            public int getLabelClassId() {
                return LabelClassId;
            }

            public void setLabelClassId(int LabelClassId) {
                this.LabelClassId = LabelClassId;
            }

            public int getPlu() {
                return Plu;
            }

            public void setPlu(int Plu) {
                this.Plu = Plu;
            }

            public String getDescription() {
                return Description;
            }

            public void setDescription(String Description) {
                this.Description = Description;
            }

            public String getProductState() {
                return ProductState;
            }

            public void setProductState(String ProductState) {
                this.ProductState = ProductState;
            }

            public boolean isIsNoSavings() {
                return IsNoSavings;
            }

            public void setIsNoSavings(boolean IsNoSavings) {
                this.IsNoSavings = IsNoSavings;
            }

            public OpenReservationsBean getOpenReservations() {
                return OpenReservations;
            }

            public void setOpenReservations(OpenReservationsBean OpenReservations) {
                this.OpenReservations = OpenReservations;
            }

            public int getCalculatedMaxStock() {
                return CalculatedMaxStock;
            }

            public void setCalculatedMaxStock(int CalculatedMaxStock) {
                this.CalculatedMaxStock = CalculatedMaxStock;
            }

            public int getCashRegisterGroupCode() {
                return CashRegisterGroupCode;
            }

            public void setCashRegisterGroupCode(int CashRegisterGroupCode) {
                this.CashRegisterGroupCode = CashRegisterGroupCode;
            }

            public int getSubBrandId() {
                return SubBrandId;
            }

            public void setSubBrandId(int SubBrandId) {
                this.SubBrandId = SubBrandId;
            }

            public int getLastModifiedByUserId() {
                return LastModifiedByUserId;
            }

            public void setLastModifiedByUserId(int LastModifiedByUserId) {
                this.LastModifiedByUserId = LastModifiedByUserId;
            }

            public String getCreatedDateTime() {
                return CreatedDateTime;
            }

            public void setCreatedDateTime(String CreatedDateTime) {
                this.CreatedDateTime = CreatedDateTime;
            }

            public boolean isIsNoQuantityPriceBreakDiscount() {
                return IsNoQuantityPriceBreakDiscount;
            }

            public void setIsNoQuantityPriceBreakDiscount(boolean IsNoQuantityPriceBreakDiscount) {
                this.IsNoQuantityPriceBreakDiscount = IsNoQuantityPriceBreakDiscount;
            }

            public int getWarrantyId() {
                return WarrantyId;
            }

            public void setWarrantyId(int WarrantyId) {
                this.WarrantyId = WarrantyId;
            }

            public int getSaleUnitDimensionId() {
                return SaleUnitDimensionId;
            }

            public void setSaleUnitDimensionId(int SaleUnitDimensionId) {
                this.SaleUnitDimensionId = SaleUnitDimensionId;
            }

            public String getProductCategoryDescription() {
                return ProductCategoryDescription;
            }

            public void setProductCategoryDescription(String ProductCategoryDescription) {
                this.ProductCategoryDescription = ProductCategoryDescription;
            }

            public int getParentProductId() {
                return ParentProductId;
            }

            public void setParentProductId(int ParentProductId) {
                this.ParentProductId = ParentProductId;
            }

            public boolean isIsCancelled() {
                return IsCancelled;
            }

            public void setIsCancelled(boolean IsCancelled) {
                this.IsCancelled = IsCancelled;
            }

            public int getWebshopProductItemId() {
                return WebshopProductItemId;
            }

            public void setWebshopProductItemId(int WebshopProductItemId) {
                this.WebshopProductItemId = WebshopProductItemId;
            }

            public PurchasePriceBean getPurchasePrice() {
                return PurchasePrice;
            }

            public void setPurchasePrice(PurchasePriceBean PurchasePrice) {
                this.PurchasePrice = PurchasePrice;
            }

            public String getPreferredSupplierName() {
                return PreferredSupplierName;
            }

            public void setPreferredSupplierName(String PreferredSupplierName) {
                this.PreferredSupplierName = PreferredSupplierName;
            }

            public int getPreferredSupplierId() {
                return PreferredSupplierId;
            }

            public void setPreferredSupplierId(int PreferredSupplierId) {
                this.PreferredSupplierId = PreferredSupplierId;
            }

            public int getGiftCardTypeId() {
                return GiftCardTypeId;
            }

            public void setGiftCardTypeId(int GiftCardTypeId) {
                this.GiftCardTypeId = GiftCardTypeId;
            }

            public boolean isDoesMaintainStock() {
                return DoesMaintainStock;
            }

            public void setDoesMaintainStock(boolean DoesMaintainStock) {
                this.DoesMaintainStock = DoesMaintainStock;
            }

            public boolean isIsNoDiscounts() {
                return IsNoDiscounts;
            }

            public void setIsNoDiscounts(boolean IsNoDiscounts) {
                this.IsNoDiscounts = IsNoDiscounts;
            }

            public FreeStockBean getFreeStock() {
                return FreeStock;
            }

            public void setFreeStock(FreeStockBean FreeStock) {
                this.FreeStock = FreeStock;
            }

            public int getDefaultSaleAmount() {
                return DefaultSaleAmount;
            }

            public void setDefaultSaleAmount(int DefaultSaleAmount) {
                this.DefaultSaleAmount = DefaultSaleAmount;
            }

            public String getClassificationLevel2Description() {
                return ClassificationLevel2Description;
            }

            public void setClassificationLevel2Description(String ClassificationLevel2Description) {
                this.ClassificationLevel2Description = ClassificationLevel2Description;
            }

            public int getProductCategoryId() {
                return ProductCategoryId;
            }

            public void setProductCategoryId(int ProductCategoryId) {
                this.ProductCategoryId = ProductCategoryId;
            }

            public boolean isIsAskForPriceInPos() {
                return IsAskForPriceInPos;
            }

            public void setIsAskForPriceInPos(boolean IsAskForPriceInPos) {
                this.IsAskForPriceInPos = IsAskForPriceInPos;
            }

            public String getLastExchangeDateTime() {
                return LastExchangeDateTime;
            }

            public void setLastExchangeDateTime(String LastExchangeDateTime) {
                this.LastExchangeDateTime = LastExchangeDateTime;
            }

            public boolean isIsMaintainStock() {
                return IsMaintainStock;
            }

            public void setIsMaintainStock(boolean IsMaintainStock) {
                this.IsMaintainStock = IsMaintainStock;
            }

            public int getAssortmentCode() {
                return AssortmentCode;
            }

            public void setAssortmentCode(int AssortmentCode) {
                this.AssortmentCode = AssortmentCode;
            }

            public int getProductCombinationGroupId() {
                return ProductCombinationGroupId;
            }

            public void setProductCombinationGroupId(int ProductCombinationGroupId) {
                this.ProductCombinationGroupId = ProductCombinationGroupId;
            }

            public boolean isIsProductGroup() {
                return IsProductGroup;
            }

            public void setIsProductGroup(boolean IsProductGroup) {
                this.IsProductGroup = IsProductGroup;
            }

            public boolean isIsPriceZeroAllowed() {
                return IsPriceZeroAllowed;
            }

            public void setIsPriceZeroAllowed(boolean IsPriceZeroAllowed) {
                this.IsPriceZeroAllowed = IsPriceZeroAllowed;
            }

            public int getLocationClassId() {
                return LocationClassId;
            }

            public void setLocationClassId(int LocationClassId) {
                this.LocationClassId = LocationClassId;
            }

            public int getContentIsoDimensionId() {
                return ContentIsoDimensionId;
            }

            public void setContentIsoDimensionId(int ContentIsoDimensionId) {
                this.ContentIsoDimensionId = ContentIsoDimensionId;
            }

            public int getOrganizationProductNumber() {
                return OrganizationProductNumber;
            }

            public void setOrganizationProductNumber(int OrganizationProductNumber) {
                this.OrganizationProductNumber = OrganizationProductNumber;
            }

            public int getCompanyId() {
                return CompanyId;
            }

            public void setCompanyId(int CompanyId) {
                this.CompanyId = CompanyId;
            }

            public MarginBean getMargin() {
                return Margin;
            }

            public void setMargin(MarginBean Margin) {
                this.Margin = Margin;
            }

            public String getFormattedDescription() {
                return FormattedDescription;
            }

            public void setFormattedDescription(String FormattedDescription) {
                this.FormattedDescription = FormattedDescription;
            }

            public StoreTypeGrossPriceBean getStoreTypeGrossPrice() {
                return StoreTypeGrossPrice;
            }

            public void setStoreTypeGrossPrice(StoreTypeGrossPriceBean StoreTypeGrossPrice) {
                this.StoreTypeGrossPrice = StoreTypeGrossPrice;
            }

            public int getPosMessageId() {
                return PosMessageId;
            }

            public void setPosMessageId(int PosMessageId) {
                this.PosMessageId = PosMessageId;
            }

            public int getItemId() {
                return ItemId;
            }

            public void setItemId(int ItemId) {
                this.ItemId = ItemId;
            }

            public boolean isIsKitchenArticle() {
                return IsKitchenArticle;
            }

            public void setIsKitchenArticle(boolean IsKitchenArticle) {
                this.IsKitchenArticle = IsKitchenArticle;
            }

            public int getParentProductNumber() {
                return ParentProductNumber;
            }

            public void setParentProductNumber(int ParentProductNumber) {
                this.ParentProductNumber = ParentProductNumber;
            }

            public MinimumStockBean getMinimumStock() {
                return MinimumStock;
            }

            public void setMinimumStock(MinimumStockBean MinimumStock) {
                this.MinimumStock = MinimumStock;
            }

            public int getSizeIsoDimensionIdPackage() {
                return SizeIsoDimensionIdPackage;
            }

            public void setSizeIsoDimensionIdPackage(int SizeIsoDimensionIdPackage) {
                this.SizeIsoDimensionIdPackage = SizeIsoDimensionIdPackage;
            }

            public boolean isProductPosMessageFound() {
                return ProductPosMessageFound;
            }

            public void setProductPosMessageFound(boolean ProductPosMessageFound) {
                this.ProductPosMessageFound = ProductPosMessageFound;
            }

            public int getPreferredSupplierNumber() {
                return PreferredSupplierNumber;
            }

            public void setPreferredSupplierNumber(int PreferredSupplierNumber) {
                this.PreferredSupplierNumber = PreferredSupplierNumber;
            }

            public boolean isIsNoDiscountOnDiscount() {
                return IsNoDiscountOnDiscount;
            }

            public void setIsNoDiscountOnDiscount(boolean IsNoDiscountOnDiscount) {
                this.IsNoDiscountOnDiscount = IsNoDiscountOnDiscount;
            }

            public boolean isIsNoMixedMatchDiscount() {
                return IsNoMixedMatchDiscount;
            }

            public void setIsNoMixedMatchDiscount(boolean IsNoMixedMatchDiscount) {
                this.IsNoMixedMatchDiscount = IsNoMixedMatchDiscount;
            }

            public int getCashRegisterGroupId() {
                return CashRegisterGroupId;
            }

            public void setCashRegisterGroupId(int CashRegisterGroupId) {
                this.CashRegisterGroupId = CashRegisterGroupId;
            }

            public int getDefaultDeliveryDays() {
                return DefaultDeliveryDays;
            }

            public void setDefaultDeliveryDays(int DefaultDeliveryDays) {
                this.DefaultDeliveryDays = DefaultDeliveryDays;
            }

            public String getAssortmentDescription() {
                return AssortmentDescription;
            }

            public void setAssortmentDescription(String AssortmentDescription) {
                this.AssortmentDescription = AssortmentDescription;
            }

            public String getClassificationLevel3Description() {
                return ClassificationLevel3Description;
            }

            public void setClassificationLevel3Description(String ClassificationLevel3Description) {
                this.ClassificationLevel3Description = ClassificationLevel3Description;
            }

            public int getBarcodeTypeId() {
                return BarcodeTypeId;
            }

            public void setBarcodeTypeId(int BarcodeTypeId) {
                this.BarcodeTypeId = BarcodeTypeId;
            }

            public String getOrderMethod() {
                return OrderMethod;
            }

            public void setOrderMethod(String OrderMethod) {
                this.OrderMethod = OrderMethod;
            }

            public int getProductNumber() {
                return ProductNumber;
            }

            public void setProductNumber(int ProductNumber) {
                this.ProductNumber = ProductNumber;
            }

            public LengthArticleBean getLengthArticle() {
                return LengthArticle;
            }

            public void setLengthArticle(LengthArticleBean LengthArticle) {
                this.LengthArticle = LengthArticle;
            }

            public boolean isIsPriceBlocked() {
                return IsPriceBlocked;
            }

            public void setIsPriceBlocked(boolean IsPriceBlocked) {
                this.IsPriceBlocked = IsPriceBlocked;
            }

            public int getSaleUnitPackageId() {
                return SaleUnitPackageId;
            }

            public void setSaleUnitPackageId(int SaleUnitPackageId) {
                this.SaleUnitPackageId = SaleUnitPackageId;
            }

            public int getClassificationLevel4Id() {
                return ClassificationLevel4Id;
            }

            public void setClassificationLevel4Id(int ClassificationLevel4Id) {
                this.ClassificationLevel4Id = ClassificationLevel4Id;
            }

            public int getClassificationLevel3Id() {
                return ClassificationLevel3Id;
            }

            public void setClassificationLevel3Id(int ClassificationLevel3Id) {
                this.ClassificationLevel3Id = ClassificationLevel3Id;
            }

            public FutureStockBean getFutureStock() {
                return FutureStock;
            }

            public void setFutureStock(FutureStockBean FutureStock) {
                this.FutureStock = FutureStock;
            }

            public int getTransportClassId() {
                return TransportClassId;
            }

            public void setTransportClassId(int TransportClassId) {
                this.TransportClassId = TransportClassId;
            }

            public int getSizeId() {
                return SizeId;
            }

            public void setSizeId(int SizeId) {
                this.SizeId = SizeId;
            }

            public int getClassificationLevel2Id() {
                return ClassificationLevel2Id;
            }

            public void setClassificationLevel2Id(int ClassificationLevel2Id) {
                this.ClassificationLevel2Id = ClassificationLevel2Id;
            }

            public NetWeightBean getNetWeight() {
                return NetWeight;
            }

            public void setNetWeight(NetWeightBean NetWeight) {
                this.NetWeight = NetWeight;
            }

            public LengthPackageBean getLengthPackage() {
                return LengthPackage;
            }

            public void setLengthPackage(LengthPackageBean LengthPackage) {
                this.LengthPackage = LengthPackage;
            }

            public int getBrandId() {
                return BrandId;
            }

            public void setBrandId(int BrandId) {
                this.BrandId = BrandId;
            }

            public int getOrderMultiplier() {
                return OrderMultiplier;
            }

            public void setOrderMultiplier(int OrderMultiplier) {
                this.OrderMultiplier = OrderMultiplier;
            }

            public int getSizeIsoDimensionIdArticle() {
                return SizeIsoDimensionIdArticle;
            }

            public void setSizeIsoDimensionIdArticle(int SizeIsoDimensionIdArticle) {
                this.SizeIsoDimensionIdArticle = SizeIsoDimensionIdArticle;
            }

            public boolean isIsAllowMultiplePricing() {
                return IsAllowMultiplePricing;
            }

            public void setIsAllowMultiplePricing(boolean IsAllowMultiplePricing) {
                this.IsAllowMultiplePricing = IsAllowMultiplePricing;
            }

            public StockBean getStock() {
                return Stock;
            }

            public void setStock(StockBean Stock) {
                this.Stock = Stock;
            }

            public int getClassificationLevel5Id() {
                return ClassificationLevel5Id;
            }

            public void setClassificationLevel5Id(int ClassificationLevel5Id) {
                this.ClassificationLevel5Id = ClassificationLevel5Id;
            }

            public boolean isIsTrackAndTraceProduct() {
                return IsTrackAndTraceProduct;
            }

            public void setIsTrackAndTraceProduct(boolean IsTrackAndTraceProduct) {
                this.IsTrackAndTraceProduct = IsTrackAndTraceProduct;
            }

            public int getSaleLedgerId() {
                return SaleLedgerId;
            }

            public void setSaleLedgerId(int SaleLedgerId) {
                this.SaleLedgerId = SaleLedgerId;
            }

            public WidthArticleBean getWidthArticle() {
                return WidthArticle;
            }

            public void setWidthArticle(WidthArticleBean WidthArticle) {
                this.WidthArticle = WidthArticle;
            }

            public boolean isPrintLabel() {
                return PrintLabel;
            }

            public void setPrintLabel(boolean PrintLabel) {
                this.PrintLabel = PrintLabel;
            }

            public AllowanceAmountBean getAllowanceAmount() {
                return AllowanceAmount;
            }

            public void setAllowanceAmount(AllowanceAmountBean AllowanceAmount) {
                this.AllowanceAmount = AllowanceAmount;
            }

            public String getCashRegisterGroupShortDescription() {
                return CashRegisterGroupShortDescription;
            }

            public void setCashRegisterGroupShortDescription(String CashRegisterGroupShortDescription) {
                this.CashRegisterGroupShortDescription = CashRegisterGroupShortDescription;
            }

            public OwnPurchasePriceBean getOwnPurchasePrice() {
                return OwnPurchasePrice;
            }

            public void setOwnPurchasePrice(OwnPurchasePriceBean OwnPurchasePrice) {
                this.OwnPurchasePrice = OwnPurchasePrice;
            }

            public MarginPercentageBean getMarginPercentage() {
                return MarginPercentage;
            }

            public void setMarginPercentage(MarginPercentageBean MarginPercentage) {
                this.MarginPercentage = MarginPercentage;
            }

            public boolean isIsCollection() {
                return IsCollection;
            }

            public void setIsCollection(boolean IsCollection) {
                this.IsCollection = IsCollection;
            }

            public int getClassificationLevel1Id() {
                return ClassificationLevel1Id;
            }

            public void setClassificationLevel1Id(int ClassificationLevel1Id) {
                this.ClassificationLevel1Id = ClassificationLevel1Id;
            }

            public int getWebshopClassificationId() {
                return WebshopClassificationId;
            }

            public void setWebshopClassificationId(int WebshopClassificationId) {
                this.WebshopClassificationId = WebshopClassificationId;
            }

            public DepthArticleBean getDepthArticle() {
                return DepthArticle;
            }

            public void setDepthArticle(DepthArticleBean DepthArticle) {
                this.DepthArticle = DepthArticle;
            }

            public OpenSaleOrdersBean getOpenSaleOrders() {
                return OpenSaleOrders;
            }

            public void setOpenSaleOrders(OpenSaleOrdersBean OpenSaleOrders) {
                this.OpenSaleOrders = OpenSaleOrders;
            }

            public boolean isIsScaleIntegration() {
                return IsScaleIntegration;
            }

            public void setIsScaleIntegration(boolean IsScaleIntegration) {
                this.IsScaleIntegration = IsScaleIntegration;
            }

            public int getSizeTypeId() {
                return SizeTypeId;
            }

            public void setSizeTypeId(int SizeTypeId) {
                this.SizeTypeId = SizeTypeId;
            }

            public int getCreatedByUserId() {
                return CreatedByUserId;
            }

            public void setCreatedByUserId(int CreatedByUserId) {
                this.CreatedByUserId = CreatedByUserId;
            }

            public float getPurchasePricePerAmount() {
                return PurchasePricePerAmount;
            }

            public void setPurchasePricePerAmount(int PurchasePricePerAmount) {
                this.PurchasePricePerAmount = PurchasePricePerAmount;
            }

            public int getAssortmentId() {
                return AssortmentId;
            }

            public void setAssortmentId(int AssortmentId) {
                this.AssortmentId = AssortmentId;
            }

            public boolean isIsAskForDescriptionInPos() {
                return IsAskForDescriptionInPos;
            }

            public void setIsAskForDescriptionInPos(boolean IsAskForDescriptionInPos) {
                this.IsAskForDescriptionInPos = IsAskForDescriptionInPos;
            }

            public StoreGrossPriceBean getStoreGrossPrice() {
                return StoreGrossPrice;
            }

            public void setStoreGrossPrice(StoreGrossPriceBean StoreGrossPrice) {
                this.StoreGrossPrice = StoreGrossPrice;
            }

            public boolean isIsSerialAdministration() {
                return IsSerialAdministration;
            }

            public void setIsSerialAdministration(boolean IsSerialAdministration) {
                this.IsSerialAdministration = IsSerialAdministration;
            }

            public GrossPurchasePriceReductionPercentageBean getGrossPurchasePriceReductionPercentage() {
                return GrossPurchasePriceReductionPercentage;
            }

            public void setGrossPurchasePriceReductionPercentage(GrossPurchasePriceReductionPercentageBean GrossPurchasePriceReductionPercentage) {
                this.GrossPurchasePriceReductionPercentage = GrossPurchasePriceReductionPercentage;
            }

            public int getDefaultWebshopClassificationId() {
                return DefaultWebshopClassificationId;
            }

            public void setDefaultWebshopClassificationId(int DefaultWebshopClassificationId) {
                this.DefaultWebshopClassificationId = DefaultWebshopClassificationId;
            }

            public boolean isIsDerived() {
                return IsDerived;
            }

            public void setIsDerived(boolean IsDerived) {
                this.IsDerived = IsDerived;
            }

            public boolean isIsAllowPriceModification() {
                return IsAllowPriceModification;
            }

            public void setIsAllowPriceModification(boolean IsAllowPriceModification) {
                this.IsAllowPriceModification = IsAllowPriceModification;
            }

            public int getClassificationLevel3Code() {
                return ClassificationLevel3Code;
            }

            public void setClassificationLevel3Code(int ClassificationLevel3Code) {
                this.ClassificationLevel3Code = ClassificationLevel3Code;
            }

            public boolean isIsGiftCard() {
                return IsGiftCard;
            }

            public void setIsGiftCard(boolean IsGiftCard) {
                this.IsGiftCard = IsGiftCard;
            }

            public boolean isVatRequired() {
                return VatRequired;
            }

            public void setVatRequired(boolean VatRequired) {
                this.VatRequired = VatRequired;
            }

            public MaximumStockBean getMaximumStock() {
                return MaximumStock;
            }

            public void setMaximumStock(MaximumStockBean MaximumStock) {
                this.MaximumStock = MaximumStock;
            }

            public int getVatPercentage() {
                return VatPercentage;
            }

            public void setVatPercentage(int VatPercentage) {
                this.VatPercentage = VatPercentage;
            }

            public GrossWeightBean getGrossWeight() {
                return GrossWeight;
            }

            public void setGrossWeight(GrossWeightBean GrossWeight) {
                this.GrossWeight = GrossWeight;
            }

            public int getColorId() {
                return ColorId;
            }

            public void setColorId(int ColorId) {
                this.ColorId = ColorId;
            }

            public String getCashRegisterGroupDescription() {
                return CashRegisterGroupDescription;
            }

            public void setCashRegisterGroupDescription(String CashRegisterGroupDescription) {
                this.CashRegisterGroupDescription = CashRegisterGroupDescription;
            }

            public int getProductCategoryCode() {
                return ProductCategoryCode;
            }

            public void setProductCategoryCode(int ProductCategoryCode) {
                this.ProductCategoryCode = ProductCategoryCode;
            }

            public int getReplacementProductId() {
                return ReplacementProductId;
            }

            public void setReplacementProductId(int ReplacementProductId) {
                this.ReplacementProductId = ReplacementProductId;
            }

            public boolean isIsIncludeInStockValue() {
                return IsIncludeInStockValue;
            }

            public void setIsIncludeInStockValue(boolean IsIncludeInStockValue) {
                this.IsIncludeInStockValue = IsIncludeInStockValue;
            }

            public NetContentBean getNetContent() {
                return NetContent;
            }

            public void setNetContent(NetContentBean NetContent) {
                this.NetContent = NetContent;
            }

            public int getArticleGroupId() {
                return ArticleGroupId;
            }

            public void setArticleGroupId(int ArticleGroupId) {
                this.ArticleGroupId = ArticleGroupId;
            }

            public String getClassificationLevel1Description() {
                return ClassificationLevel1Description;
            }

            public void setClassificationLevel1Description(String ClassificationLevel1Description) {
                this.ClassificationLevel1Description = ClassificationLevel1Description;
            }

            public boolean isIsAllowDiscountPercentageModification() {
                return IsAllowDiscountPercentageModification;
            }

            public void setIsAllowDiscountPercentageModification(boolean IsAllowDiscountPercentageModification) {
                this.IsAllowDiscountPercentageModification = IsAllowDiscountPercentageModification;
            }

            public OpenPurchaseOrdersBean getOpenPurchaseOrders() {
                return OpenPurchaseOrders;
            }

            public void setOpenPurchaseOrders(OpenPurchaseOrdersBean OpenPurchaseOrders) {
                this.OpenPurchaseOrders = OpenPurchaseOrders;
            }

            public int getContentIsoPackageId() {
                return ContentIsoPackageId;
            }

            public void setContentIsoPackageId(int ContentIsoPackageId) {
                this.ContentIsoPackageId = ContentIsoPackageId;
            }

            public int getWeightIsoDimensionId() {
                return WeightIsoDimensionId;
            }

            public void setWeightIsoDimensionId(int WeightIsoDimensionId) {
                this.WeightIsoDimensionId = WeightIsoDimensionId;
            }

            public int getDisposalFeeId() {
                return DisposalFeeId;
            }

            public void setDisposalFeeId(int DisposalFeeId) {
                this.DisposalFeeId = DisposalFeeId;
            }

            public DepthPackageBean getDepthPackage() {
                return DepthPackage;
            }

            public void setDepthPackage(DepthPackageBean DepthPackage) {
                this.DepthPackage = DepthPackage;
            }

            public String getMarkingCodeType() {
                return MarkingCodeType;
            }

            public void setMarkingCodeType(String MarkingCodeType) {
                this.MarkingCodeType = MarkingCodeType;
            }

            public HeightArticleBean getHeightArticle() {
                return HeightArticle;
            }

            public void setHeightArticle(HeightArticleBean HeightArticle) {
                this.HeightArticle = HeightArticle;
            }

            public boolean isIsNoDiscountAgreementDiscount() {
                return IsNoDiscountAgreementDiscount;
            }

            public void setIsNoDiscountAgreementDiscount(boolean IsNoDiscountAgreementDiscount) {
                this.IsNoDiscountAgreementDiscount = IsNoDiscountAgreementDiscount;
            }

            public int getOrganizationId() {
                return OrganizationId;
            }

            public void setOrganizationId(int OrganizationId) {
                this.OrganizationId = OrganizationId;
            }

            public int getMinimumOrderQuantity() {
                return MinimumOrderQuantity;
            }

            public void setMinimumOrderQuantity(int MinimumOrderQuantity) {
                this.MinimumOrderQuantity = MinimumOrderQuantity;
            }

            public boolean isIsAskForAmountInPos() {
                return IsAskForAmountInPos;
            }

            public void setIsAskForAmountInPos(boolean IsAskForAmountInPos) {
                this.IsAskForAmountInPos = IsAskForAmountInPos;
            }

            public boolean isManualMinMaxStock() {
                return ManualMinMaxStock;
            }

            public void setManualMinMaxStock(boolean ManualMinMaxStock) {
                this.ManualMinMaxStock = ManualMinMaxStock;
            }

            public WidthPackageBean getWidthPackage() {
                return WidthPackage;
            }

            public void setWidthPackage(WidthPackageBean WidthPackage) {
                this.WidthPackage = WidthPackage;
            }

            public int getExternalProductId() {
                return ExternalProductId;
            }

            public void setExternalProductId(int ExternalProductId) {
                this.ExternalProductId = ExternalProductId;
            }

            public GrossPurchasePriceBean getGrossPurchasePrice() {
                return GrossPurchasePrice;
            }

            public void setGrossPurchasePrice(GrossPurchasePriceBean GrossPurchasePrice) {
                this.GrossPurchasePrice = GrossPurchasePrice;
            }

            public AdvicePriceBean getAdvicePrice() {
                return AdvicePrice;
            }

            public void setAdvicePrice(AdvicePriceBean AdvicePrice) {
                this.AdvicePrice = AdvicePrice;
            }

            public HeightPackageBean getHeightPackage() {
                return HeightPackage;
            }

            public void setHeightPackage(HeightPackageBean HeightPackage) {
                this.HeightPackage = HeightPackage;
            }

            public int getFollowupNumber() {
                return FollowupNumber;
            }

            public void setFollowupNumber(int FollowupNumber) {
                this.FollowupNumber = FollowupNumber;
            }

            public boolean isIsSale() {
                return IsSale;
            }

            public void setIsSale(boolean IsSale) {
                this.IsSale = IsSale;
            }

            public String getSearchText() {
                return SearchText;
            }

            public void setSearchText(String SearchText) {
                this.SearchText = SearchText;
            }

            public String getSaleUnitPackageDescription() {
                return SaleUnitPackageDescription;
            }

            public void setSaleUnitPackageDescription(String SaleUnitPackageDescription) {
                this.SaleUnitPackageDescription = SaleUnitPackageDescription;
            }

            public String getSaleUnitPackageShortDescription() {
                return SaleUnitPackageShortDescription;
            }

            public void setSaleUnitPackageShortDescription(String SaleUnitPackageShortDescription) {
                this.SaleUnitPackageShortDescription = SaleUnitPackageShortDescription;
            }

            public String getPurchaseStatusRowDescription() {
                return PurchaseStatusRowDescription;
            }

            public void setPurchaseStatusRowDescription(String PurchaseStatusRowDescription) {
                this.PurchaseStatusRowDescription = PurchaseStatusRowDescription;
            }

            public String getExchangeRemarks() {
                return ExchangeRemarks;
            }

            public void setExchangeRemarks(String ExchangeRemarks) {
                this.ExchangeRemarks = ExchangeRemarks;
            }

            public int getPurchaseStatusRowCode() {
                return PurchaseStatusRowCode;
            }

            public void setPurchaseStatusRowCode(int PurchaseStatusRowCode) {
                this.PurchaseStatusRowCode = PurchaseStatusRowCode;
            }

            public String getOrderCode() {
                return OrderCode;
            }

            public void setOrderCode(String OrderCode) {
                this.OrderCode = OrderCode;
            }

            public String getBrandDescription() {
                return BrandDescription;
            }

            public void setBrandDescription(String BrandDescription) {
                this.BrandDescription = BrandDescription;
            }

            public int getBrandCode() {
                return BrandCode;
            }

            public void setBrandCode(int BrandCode) {
                this.BrandCode = BrandCode;
            }

            public String getNote2() {
                return Note2;
            }

            public void setNote2(String Note2) {
                this.Note2 = Note2;
            }

            public String getNote1() {
                return Note1;
            }

            public void setNote1(String Note1) {
                this.Note1 = Note1;
            }

            public int getCbsCode() {
                return CbsCode;
            }

            public void setCbsCode(int CbsCode) {
                this.CbsCode = CbsCode;
            }

            public static class OpenReservationsBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil119; // FIXME check this code

                public boolean is_$XsiNil119() {
                    return _$XsiNil119;
                }

                public void set_$XsiNil119(boolean _$XsiNil119) {
                    this._$XsiNil119 = _$XsiNil119;
                }
            }

            public static class PurchasePriceBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil0; // FIXME check this code

                public boolean is_$XsiNil0() {
                    return _$XsiNil0;
                }

                public void set_$XsiNil0(boolean _$XsiNil0) {
                    this._$XsiNil0 = _$XsiNil0;
                }
            }

            public static class FreeStockBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil65; // FIXME check this code

                public boolean is_$XsiNil65() {
                    return _$XsiNil65;
                }

                public void set_$XsiNil65(boolean _$XsiNil65) {
                    this._$XsiNil65 = _$XsiNil65;
                }
            }

            public static class MarginBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil131; // FIXME check this code

                public boolean is_$XsiNil131() {
                    return _$XsiNil131;
                }

                public void set_$XsiNil131(boolean _$XsiNil131) {
                    this._$XsiNil131 = _$XsiNil131;
                }
            }

            public static class StoreTypeGrossPriceBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil230; // FIXME check this code

                public boolean is_$XsiNil230() {
                    return _$XsiNil230;
                }

                public void set_$XsiNil230(boolean _$XsiNil230) {
                    this._$XsiNil230 = _$XsiNil230;
                }
            }

            public static class MinimumStockBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil158; // FIXME check this code

                public boolean is_$XsiNil158() {
                    return _$XsiNil158;
                }

                public void set_$XsiNil158(boolean _$XsiNil158) {
                    this._$XsiNil158 = _$XsiNil158;
                }
            }

            public static class LengthArticleBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil207; // FIXME check this code

                public boolean is_$XsiNil207() {
                    return _$XsiNil207;
                }

                public void set_$XsiNil207(boolean _$XsiNil207) {
                    this._$XsiNil207 = _$XsiNil207;
                }
            }

            public static class FutureStockBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil246; // FIXME check this code

                public boolean is_$XsiNil246() {
                    return _$XsiNil246;
                }

                public void set_$XsiNil246(boolean _$XsiNil246) {
                    this._$XsiNil246 = _$XsiNil246;
                }
            }

            public static class NetWeightBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil96; // FIXME check this code

                public boolean is_$XsiNil96() {
                    return _$XsiNil96;
                }

                public void set_$XsiNil96(boolean _$XsiNil96) {
                    this._$XsiNil96 = _$XsiNil96;
                }
            }

            public static class LengthPackageBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil59; // FIXME check this code

                public boolean is_$XsiNil59() {
                    return _$XsiNil59;
                }

                public void set_$XsiNil59(boolean _$XsiNil59) {
                    this._$XsiNil59 = _$XsiNil59;
                }
            }

            public static class StockBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil64; // FIXME check this code

                public boolean is_$XsiNil64() {
                    return _$XsiNil64;
                }

                public void set_$XsiNil64(boolean _$XsiNil64) {
                    this._$XsiNil64 = _$XsiNil64;
                }
            }

            public static class WidthArticleBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil198; // FIXME check this code

                public boolean is_$XsiNil198() {
                    return _$XsiNil198;
                }

                public void set_$XsiNil198(boolean _$XsiNil198) {
                    this._$XsiNil198 = _$XsiNil198;
                }
            }

            public static class AllowanceAmountBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil179; // FIXME check this code

                public boolean is_$XsiNil179() {
                    return _$XsiNil179;
                }

                public void set_$XsiNil179(boolean _$XsiNil179) {
                    this._$XsiNil179 = _$XsiNil179;
                }
            }

            public static class OwnPurchasePriceBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil141; // FIXME check this code

                public boolean is_$XsiNil141() {
                    return _$XsiNil141;
                }

                public void set_$XsiNil141(boolean _$XsiNil141) {
                    this._$XsiNil141 = _$XsiNil141;
                }
            }

            public static class MarginPercentageBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil81; // FIXME check this code

                public boolean is_$XsiNil81() {
                    return _$XsiNil81;
                }

                public void set_$XsiNil81(boolean _$XsiNil81) {
                    this._$XsiNil81 = _$XsiNil81;
                }
            }

            public static class DepthArticleBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil231; // FIXME check this code

                public boolean is_$XsiNil231() {
                    return _$XsiNil231;
                }

                public void set_$XsiNil231(boolean _$XsiNil231) {
                    this._$XsiNil231 = _$XsiNil231;
                }
            }

            public static class OpenSaleOrdersBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil8; // FIXME check this code

                public boolean is_$XsiNil8() {
                    return _$XsiNil8;
                }

                public void set_$XsiNil8(boolean _$XsiNil8) {
                    this._$XsiNil8 = _$XsiNil8;
                }
            }

            public static class StoreGrossPriceBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil79; // FIXME check this code

                public boolean is_$XsiNil79() {
                    return _$XsiNil79;
                }

                public void set_$XsiNil79(boolean _$XsiNil79) {
                    this._$XsiNil79 = _$XsiNil79;
                }
            }

            public static class GrossPurchasePriceReductionPercentageBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil192; // FIXME check this code

                public boolean is_$XsiNil192() {
                    return _$XsiNil192;
                }

                public void set_$XsiNil192(boolean _$XsiNil192) {
                    this._$XsiNil192 = _$XsiNil192;
                }
            }

            public static class MaximumStockBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil169; // FIXME check this code

                public boolean is_$XsiNil169() {
                    return _$XsiNil169;
                }

                public void set_$XsiNil169(boolean _$XsiNil169) {
                    this._$XsiNil169 = _$XsiNil169;
                }
            }

            public static class GrossWeightBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil136; // FIXME check this code

                public boolean is_$XsiNil136() {
                    return _$XsiNil136;
                }

                public void set_$XsiNil136(boolean _$XsiNil136) {
                    this._$XsiNil136 = _$XsiNil136;
                }
            }

            public static class NetContentBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil320; // FIXME check this code

                public boolean is_$XsiNil320() {
                    return _$XsiNil320;
                }

                public void set_$XsiNil320(boolean _$XsiNil320) {
                    this._$XsiNil320 = _$XsiNil320;
                }
            }

            public static class OpenPurchaseOrdersBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil113; // FIXME check this code

                public boolean is_$XsiNil113() {
                    return _$XsiNil113;
                }

                public void set_$XsiNil113(boolean _$XsiNil113) {
                    this._$XsiNil113 = _$XsiNil113;
                }
            }

            public static class DepthPackageBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil187; // FIXME check this code

                public boolean is_$XsiNil187() {
                    return _$XsiNil187;
                }

                public void set_$XsiNil187(boolean _$XsiNil187) {
                    this._$XsiNil187 = _$XsiNil187;
                }
            }

            public static class HeightArticleBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil281; // FIXME check this code

                public boolean is_$XsiNil281() {
                    return _$XsiNil281;
                }

                public void set_$XsiNil281(boolean _$XsiNil281) {
                    this._$XsiNil281 = _$XsiNil281;
                }
            }

            public static class WidthPackageBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil140; // FIXME check this code

                public boolean is_$XsiNil140() {
                    return _$XsiNil140;
                }

                public void set_$XsiNil140(boolean _$XsiNil140) {
                    this._$XsiNil140 = _$XsiNil140;
                }
            }

            public static class GrossPurchasePriceBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil67; // FIXME check this code

                public boolean is_$XsiNil67() {
                    return _$XsiNil67;
                }

                public void set_$XsiNil67(boolean _$XsiNil67) {
                    this._$XsiNil67 = _$XsiNil67;
                }
            }

            public static class AdvicePriceBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil215; // FIXME check this code

                public boolean is_$XsiNil215() {
                    return _$XsiNil215;
                }

                public void set_$XsiNil215(boolean _$XsiNil215) {
                    this._$XsiNil215 = _$XsiNil215;
                }
            }

            public static class HeightPackageBean {
                @SerializedName("xsi:nil")
                private boolean _$XsiNil224; // FIXME check this code

                public boolean is_$XsiNil224() {
                    return _$XsiNil224;
                }

                public void set_$XsiNil224(boolean _$XsiNil224) {
                    this._$XsiNil224 = _$XsiNil224;
                }
            }
        }
    }
}
