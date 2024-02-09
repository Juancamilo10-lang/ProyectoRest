Feature: manage posts

  @Getpost
  Scenario:  view and manage successfully user posts
    When i consume the posts endpoint
    Then you should see the available posts