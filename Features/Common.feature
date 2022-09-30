Feature: Header and Footer

Background:
Given User is logged on to LMS website

Scenario Outline: Validate the heading
When User is on "<Module>" page
Then User should see a heading with text "<Manage Module>" on the "<Module>" page

Examples:
| Module | Manage Module |
| Program | Manage Program |
| Batch | Manage Batch |
| User | Manage User |
| Assignment | Manage Assignment |

Scenario Outline: Validating the default state of Delete button 
When User is on "<Module>" page
Then User should see the Delete button on the top left hand side of "<Module>" page as Disabled

Examples:
| Module |
| Program |
| Batch |
| User |
| Assignment |

Scenario Outline: Validate Search Feature 
When User is on "<Module>" page
Then Text box used for search has text as 'Search...' on "<Module>" page

Examples:
| Module |
| Program |
| Batch |
| User |
| Assignment |

Scenario Outline: Validate the footer
When User is on "<Module>" page
Then User should see the footer as "In total there are z <modules>." on "<Module>" page

Examples:
| Module | modules |
| Program | programs |
| Batch | batches |
| User | users |
| Assignment | assignments |