package com.nvoulgaris.testingworkshop.examples.readability

import spock.lang.Specification

class AddonsSpec extends Specification {

    def "testAIA"() {
//        Brand brand = brandRepository.findBrand("airtickets", "gr");
//        Market market = brand.getBrandMarketProviders().stream().findFirst().get().getMarket();
//        Provider provider = addOnsProviderVisitor.findProvidersByCode(market, Providers.AIA).stream().findFirst().get();
//
//        AddOnsParkingSearchRequest parkspaceCriteria = new AddOnsParkingSearchRequest();
//
//        parkspaceCriteria.setAirportCode("ATH");
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmm");
//        parkspaceCriteria.setParkingStartDateTime(LocalDateTime.parse("1000", formatter));
//        parkspaceCriteria.setParkingEndDateTime(LocalDateTime.parse("1600", formatter));
//
//        AddOnsParkingSearchResponse search = addOnsParkingService.search(parkspaceCriteria, provider.getCode());
//        //		Assert.notNull(search);
//        //		Assert.notNull(search.getPrice());
//
//        AddOnsParkingSearchResponseOptions addOnsParkingSearchResponseOptionSelected = search.getAddOnsParkingSearchResponseOptions().get(0);
//
//        AddOnsParkingBookRequest request = new AddOnsParkingBookRequest();
//        request.setCarIdentification("YHA7157");
//
//        request.setAdditionalServiceSelected(true);
//        request.setAgentCode("456");
//        request.setArrivalDateTime(LocalDateTime.of(2015, Month.SEPTEMBER, 19, 0, 0, 0));
//        request.setArrivalFlightCode("123456");
//
//        AddOnsBillingDetails AddOnsParkingBillingDetails = new AddOnsBillingDetails();
//        request.setBillingDetails(AddOnsParkingBillingDetails );
//
//
//        AddOnsContactDetails addonsParkingContactDetails = initContactDetails();
//
//        request.setContactDetails(addonsParkingContactDetails);
//        request.setCustomerCode("1234567");
//        request.setDepartureDateTime(LocalDateTime.of(2015, Month.SEPTEMBER, 20, 0, 0, 0));
//        request.setDepartureFlightCode("ssdfgsdf");
//        request.setFirstLegFirstSegmentArrivalAirportName("SKG");
//        request.setLastLegLastSegmentDepartureAirportName("ATH");
//        request.setLocale(Locale.ENGLISH);
//        AddOnsParking addOnsParking = initAddOnsParking(addOnsParkingSearchResponseOptionSelected);
//
//        request.setParking(addOnsParking );
//        //		request.setPnr("12345");
//        //		request.setProviderSupportedAirport(null);
//
//        AddOnsParkingBookResponse book = addOnsParkingService.book(request , provider.getCode());
//
//        Assert.notNull(book.getParking());
//        Assert.notNull(book.getParking().getBookingReference());
    }
}
