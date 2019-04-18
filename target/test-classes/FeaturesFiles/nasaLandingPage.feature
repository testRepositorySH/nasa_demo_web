@tag
Feature: Certify Nasa Home page

Background: User is Logged In
Given nasa URL

#page title needs to match with given expected 

  @PageTitle @sanity @regression 
  Scenario: Page Title Validation 
  When I Land on Homepage
  Then I validate the page title
  
#Search input box and search button should work properly

 	@search @sanity @regression 
   Scenario: Validating Search Box is enabled to put input 
   
   When I Land on Homepage
   And I click on Search box 
   Then I am able to put input
    And I Click on Search button
   
   
   # Validating if the Search showing the right content (right filter is getting applied), such as if searching for a contants Image; only image should get 
   # populated not video or audio 
   
   @image @regression @validate
   Scenario: Validating Image feature with search box showing only filtered result 
   
   When I Land on Homepage
   And I click on video and audio features
   Then I am able to put input 
   And I Click on Search button
   And I am able to see search result for Image 
   
   @videoSearch @sanity @regression 
   Scenario: Validating video feature with search box showing only filtered result
   
   When I Land on Homepage
   When I click on image and audio features
   Then I am able to put input 
   And I Click on Search button
   Then I am able to see search result for Video  

   
   @audioSearch @regression
   Scenario: Validating audio feature with search box showing only filtered result
   When I Land on Homepage
   When I click on video and image features
   Then I am able to put input 
   And I Click on Search button
   Then I am able to see search result for Audio  
   
   
   # Validating if multiple filter with input provides the right contents , such as if for an input end user wants to view Image and Video but not audio 
   # post search end user should be able to see result according to filters
   
   
   
   @videoAndAudioContent @regression
   Scenario: Validating filter result showing video and audio content after deselecing image 
   
   When I Land on Homepage
   And I click on Image feature 
   Then I am able to put input 
   And I Click on Search button
   And I validate the video and audio contants
   
   
   
    @imageAndAudioContent @regression
   Scenario: Validating filter result showing image and audio content after deselecing video 
   
   When I Land on Homepage
   And I click on Video feature 
   Then I am able to put input 
   And I Click on Search button
   And I validate the image and audio contants
   
     
    @videoAndimageContent @regression
   Scenario: Validating filter result showing video and image content after deselecing audio 
   
   When I Land on Homepage
   And I click on Audio feature 
   Then I am able to put input 
   And I Click on Search button
   And I validate the video and image contants
   
  
   @allContentSearch @regression
   Scenario: Validating searching of an input with all three type of contant 
   
   When I Land on Homepage
   And I dont deselect any filter ,so by default all three filters are availble 
   Then I am able to put input 
   And I Click on Search button
   And I validate the contants
   
   
   
   
   
   
   
   
   
   
   
   
   