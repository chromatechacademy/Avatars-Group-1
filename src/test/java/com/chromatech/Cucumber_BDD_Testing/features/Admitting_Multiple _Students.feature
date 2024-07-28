Feature: AG1CP-19: Admitting multiple students

  @Regression @AG1CP-19 @Vlad @AdmittingMultipleStudents
  Scenario Outline: Admitting multiple students
    Given a CTSMS user is logged in to the main page "https://mexil.it/chroma/admin/admin/dashboard"
    When user goes to the "Bulk Delete" page:
      | Module              | SubModule   | URL                                        |
      | Student Information | Bulk Delete | https://mexil.it/chroma/student/bulkdelete |
    When if a student record already exists, the user deletes it:
      | Class   | Section   | Admission Number   | Alert Text                            |
      | <Class> | <Section> | <Admission Number> | Are you sure you want to delete this? |
    When user goes to the "Student Admission" page:
      | Module              | SubModule         | URL                                    |
      | Student Information | Student Admission | https://mexil.it/chroma/student/create |
    And user fills the first row:
      | Admission No       | Roll Number   | Class   | Section   |
      | <Admission Number> | <Roll Number> | <Class> | <Section> |
    And user fills the second row:
      | First Name   | Last Name   | Gender   | Date of Birth   |
      | <First Name> | <Last Name> | <Gender> | <Date of Birth> |
    And user fills the third row:
      | Category   | Email   |
      | <Category> | <Email> |
    And user fills the fourth row:
      | Admission Date   | Blood Group   | As on Date   |
      | <Admission Date> | <Blood Group> | <As on Date> |
    And user fills the fifth row:
      | Mobile Number   | Height   | Weight   |
      | <Mobile Number> | <Height> | <Weight> |
    And user adds father's information:
      | Father Name   | Father Phone   | Father Occupation   |
      | <Father Name> | <Father Phone> | <Father Occupation> |
    And user adds mother's information:
      | Mother Name   | Mother Phone   | Mother Occupation   |
      | <Mother Name> | <Mother Phone> | <Mother Occupation> |
    And user selects "<If Guardian Is>" in If Guardian Is radiobuttons
    And user adds the first row of guardian's information:
      | Guardian Name   | Guardian Relation   | Guardian Email   |
      | <Guardian Name> | <Guardian Relation> | <Guardian Email> |
    And user adds the second row of guardian's information:
      | Guardian Phone   | Guardian Occupation   | Guardian Address   |
      | <Guardian Phone> | <Guardian Occupation> | <Guardian Address> |
    And user adds information in the "Student Address Details" block:
      | If Guardian Address is Current Address  | <If Guardian Address is Current Address>  |
      | Current Address                         | <Current Address>                         |
      | If Permanent Address is Current Address | <If Permanent Address is Current Address> |
      | Permanent Address                       | <Permanent Address>                       |
    And user adds information in the first row of the "Miscellaneous Details" section:
      | Bank Account Number   | Bank Name   | IFSC Code   |
      | <Bank Account Number> | <Bank Name> | <IFSC Code> |
    And user adds information in the second row of the "Miscellaneous Details" section:
      | National Identification Number   | Local Identification Number   | RTE   |
      | <National Identification Number> | <Local Identification Number> | <RTE> |
    And user adds information in the third row of the "Miscellaneous Details" section:
      | Previous School Details   | Note   |
      | <Previous School Details> | <Note> |
    And fills out all text fields and uploads files in the "Upload Documents" section:
      | Title #1   | Title #2   | Title #3   | Title #4   |
      | <Title #1> | <Title #2> | <Title #3> | <Title #4> |
    And saves submission
    Then user receives a message of success "Record Saved Successfully"
    When user goes to the "Student Details" page:
      | Module              | SubModule       | URL                                    |
      | Student Information | Student Details | https://mexil.it/chroma/student/search |
    And user is searching for a student record based on parameters:
      | Class            | <Class>            |
      | Section          | <Section>          |
      | Admission Number | <Admission Number> |
    Then make sure the entry "<Admission Number>" is in the list and verify data
      | Admission Number | <Admission Number> |
      | Student Name     | <Student Name>     |
      | Class(Section)   | <Class(Section)>   |
      | Father Name      | <Father Name>      |
      | Date of Birth    | <Date of Birth>    |
      | Gender           | <Gender>           |
      | Category         | <Category>         |
      | Mobile Number    | <Mobile Number>    |
      | Height           | <Height>           |
      | Weight           | <Weight>           |
    When user goes to the "Bulk Delete" page:
      | Module              | SubModule   | URL                                        |
      | Student Information | Bulk Delete | https://mexil.it/chroma/student/bulkdelete |
    When if a student record already exists, the user deletes it:
      | Class   | Section   | Admission Number   | Alert Text                            |
      | <Class> | <Section> | <Admission Number> | Are you sure you want to delete this? |
    Examples:
      | Admission Number | Roll Number | Class          | Section               | First Name | Last Name   | Gender | Date of Birth | Category | Email                             | Admission Date | Blood Group | As on Date | Mobile Number | Height | Weight | Father Name | Father Phone | Father Occupation   | Mother Name | Mother Phone | Mother Occupation   | If Guardian Is | Guardian Name | Guardian Relation | Guardian Phone | Guardian Occupation | Guardian Email                      | Guardian Address | If Guardian Address is Current Address | Current Address                                          | If Permanent Address is Current Address | Permanent Address                                             | Bank Account Number | Bank Name                | IFSC Code     | National Identification Number | Local Identification Number | RTE | Previous School Details      | Note               | Title #1   | Title #2    | Title #3   | Title #4  | Student Name        | Class(Section)              |
      | 33331            | 0002        | SDET           | Cucumber Fundamentals | Anjel      | Doggett     | Female | 01/01/1990    | new      | averill_tibbitshv83@decorating.le | 04/20/2001     | O+          | 11/03/2002 | 6028808881    | 5'1    | 100    | Uniqua      | 602802771    | Father Occupation1  | Princella   | 6028803331   | Mother Occupation1  | father         | Chroma1       | Tech1             | 6028801021     | Academy1            | antionne_cribbs0@truck.obl          | 123 N Street     | true                                   | Textbooks Road 3149, North Hero, Malawi, 525780          | true                                    | Once Street 5488, Shedd, Namibia, 898381                      | 0112345670          | TrustBank                | A123456789010 | 20-10563145-0                  | 1234 4321 1234 4320         | Yes | https://alwaysn0t9jwavvo.vcu | This is a note #1  | Vander #1  | Medarda #1  | Victor #1  | Jayce #1  | Anjel Doggett       | SDET(Cucumber Fundamentals) |
      | 33332            | 0003        | SDET           | Cucumber Fundamentals | Shawndale  | Sublett     | Male   | 01/01/1999    | new      | keyon_armentrout0y@practical.ofw  | 04/20/2002     | A+          | 11/03/2003 | 6028808882    | 5'2    | 105    | Naim        | 602802772    | Father Occupation2  | Ayasha      | 6028803332   | Mother Occupation2  | mother         | Chroma2       | Tech2             | 6028801022     | Academy2            | tyrina_petermangk@complications.jtv | 124 N Street     | false                                  | Guard Road 7462, London Mills, France, 077033            | true                                    | Xml Road 6714, Berwick Upon Tweed, Luxembourg, 471628         | 0112345671          | EliteFinance             | A123456789011 | 20-10563145-1                  | 1234 4321 1234 4321         | No  | https://fujitsu6fcj4n.rb     | This is a note #2  | Vander #2  | Medarda #2  | Victor #2  | Jayce #2  | Shawndale Sublett   | SDET(Cucumber Fundamentals) |
      | 33333            | 0004        | SDET           | Cucumber Fundamentals | Sandi      | Gerardi     | Female | 01/01/1992    | new      | niomi_sikes0pzg@diane.twl         | 04/20/2003     | B+          | 11/03/2004 | 6028808883    | 5'3    | 110    | Chatoya     | 602802773    | Father Occupation3  | Kady        | 6028803333   | Mother Occupation3  | other          | Chroma3       | Tech3             | 6028801023     | Academy3            | atara_strohlho@statewide.ah         | 125 N Street     | true                                   | Organized Street 6642, Asotin, Gabon, 719769             | false                                   | Stream St 8413, Huntington Beach, Mauritania, 459109          | 0112345672          | Prosperity Alliance Bank | A123456789012 | 20-10563145-2                  | 1234 4321 1234 4322         | Yes | https://displayxvsebkjqo.yn  | This is a note #3  | Vander #3  | Medarda #3  | Victor #3  | Jayce #3  | Sandi Gerardi       | SDET(Cucumber Fundamentals) |
      | 33334            | 0005        | SDET           | Cucumber Fundamentals | Darilyn    | Bate        | Male   | 01/01/1993    | new      | emmitt_ishmaelug@angel.saj        | 04/20/2004     | AB+         | 11/03/2005 | 6028808884    | 5'4    | 200    | Kathelyn    | 602802774    | Father Occupation4  | Rana        | 6028803334   | Mother Occupation4  | father         | Chroma4       | Tech4             | 6028801024     | Academy4            | seanpaul_shislerlc@doc.eej          | 126 N Street     | false                                  | Territory Road 2561, State Farm, Ukraine, 571870         | false                                   | Winning St 7008, Joaquin, Antarctica, 917054                  | 0112345673          | Bank of America          | A123456789013 | 20-10563145-3                  | 1234 4321 1234 4323         | No  | https://hydrogen4vp.exk      | This is a note #4  | Vander #4  | Medarda #4  | Victor #4  | Jayce #4  | Darilyn Bate        | SDET(Cucumber Fundamentals) |
      | 33335            | 0006        | SDET           | Cucumber Fundamentals | Keirra     | Wimbish     | Female | 01/01/1994    | new      | elizabethann_cappbcuh@yukon.vms   | 04/20/2005     | O-          | 11/03/2006 | 6028808885    | 5'5    | 205    | Kaylah      | 602802775    | Father Occupation5  | Marti       | 6028803335   | Mother Occupation5  | mother         | Chroma5       | Tech5             | 6028801025     | Academy5            | kyonna_heroldhjhr@shopzilla.lbg     | 127 N Street     | true                                   | Seminars St 3054, Alcove, Armenia, 181518                | true                                    | Asia Street 1051, Mount Desert, Costa Rica, 662072            | 0112345674          | TrustBank                | A123456789014 | 20-10563145-4                  | 1234 4321 1234 4324         | Yes | https://arthritiskph.kx      | This is a note #5  | Vander #5  | Medarda #5  | Victor #5  | Jayce #5  | Keirra Wimbish      | SDET(Cucumber Fundamentals) |
      | 33336            | 0007        | Cyber Security | CIA Triad             | Chisholm   | Macias      | Male   | 01/01/1995    | new      | kaitlin_man7i@voltage.doz         | 04/20/2006     | A-          | 11/03/2007 | 6028808886    | 5'6    | 210    | Mashanda    | 602802776    | Father Occupation6  | Vaness      | 6028803336   | Mother Occupation6  | other          | Chroma6       | Tech6             | 6028801026     | Academy6            | fabien_lapierrem@interesting.vng    | 128 N Street     | false                                  | Resorts Street 8621, Crockett Mills, El Salvador, 790896 | true                                    | Administration St 4981, Athol, Netherlands Antilles, 565213   | 0112345675          | Bank of America          | A123456789015 | 20-10563145-5                  | 1234 4321 1234 4325         | No  | https://hostelsye4rs0.yra    | This is a note #6  | Vander #6  | Medarda #6  | Victor #6  | Jayce #6  | Chisholm Macias     | Cyber Security(CIA Triad)   |
      | 33337            | 0008        | Cyber Security | CIA Triad             | Darik      | Blosser     | Female | 01/01/1996    | new      | donna_plumleypm@transport.ps      | 04/20/2007     | B-          | 11/03/2008 | 6028808887    | 5'7    | 300    | Dujuan      | 602802777    | Father Occupation7  | Azure       | 6028803337   | Mother Occupation7  | father         | Chroma7       | Tech7             | 6028801027     | Academy7            | darcey_mccoinkjn@skilled.zp         | 129 N Street     | true                                   | Brass Street 9152, Rishikesh, Solomon Islands, 365522    | false                                   | Sink St 1407, Yangcheng, Mozambique, 877799                   | 0112345676          | Bank of America          | A123456789016 | 20-10563145-6                  | 1234 4321 1234 4326         | Yes | https://yeahuwcbu1n.he       | This is a note #7  | Vander #7  | Medarda #7  | Victor #7  | Jayce #7  | Darik Blosser       | Cyber Security(CIA Triad)   |
      | 33338            | 0009        | Cyber Security | CIA Triad             | Darwin     | Newborn     | Male   | 01/01/1997    | new      | nallely_douglasr7i1@episode.yq    | 04/20/2008     | AB-         | 11/03/2009 | 6028808888    | 5'8    | 305    | Lysandra    | 602802778    | Father Occupation8  | Maegan      | 6028803338   | Mother Occupation8  | mother         | Chroma8       | Tech8             | 6028801028     | Academy8            | aliah_brunellhjew@mali.ior          | 130 N Street     | false                                  | Cologne Street 5921, Lamoine, Tunisia, 994380            | false                                   | Personally St 9297, Lstykke, Northern Mariana Islands, 120262 | 0112345677          | Bank of America          | A123456789017 | 20-10563145-7                  | 1234 4321 1234 4327         | No  | https://nickelr86.tc         | This is a note #8  | Vander #8  | Medarda #8  | Victor #8  | Jayce #8  | Darwin Newborn      | Cyber Security(CIA Triad)   |
      | 33339            | 0010        | Cyber Security | CIA Triad             | Ambor      | Gutowski    | Female | 01/01/1998    | new      | desma_kawamura3gm@sussex.lz       | 04/20/2009     | B+          | 11/03/2010 | 6028808889    | 5'9    | 310    | Shantal     | 602802779    | Father Occupation9  | Almee       | 6028803339   | Mother Occupation9  | other          | Chroma9       | Tech9             | 6028801029     | Academy9            | husain_bragdonbd@economy.ioa        | 131 N Street     | true                                   | Coupon Street 6881, Whitney Point, Armenia, 144323       | true                                    | Yacht Street 7605, Tsetserleg, Brazil, 563517                 | 0112345678          | TrustBank                | A123456789018 | 20-10563145-8                  | 1234 4321 1234 4328         | Yes | https://packingf.ba          | This is a note #9  | Vander #9  | Medarda #9  | Victor #9  | Jayce #9  | Ambor Gutowski      | Cyber Security(CIA Triad)   |
      | 33340            | 0011        | Cyber Security | CIA Triad             | Mecaela    | Stoneburner | Male   | 01/01/1999    | new      | sumer_lipscombr@football.ct       | 04/20/2010     | B+          | 11/03/2011 | 6028808810    | 6'0    | 0      | Deantes     | 602802710    | Father Occupation10 | Louie       | 6028803310   | Mother Occupation10 | father         | Chroma10      | Tech10            | 6028801030     | Academy10           | brittaney_sabo5o@radiation.eg       | 132 N Street     | false                                  | Nissan Road 8548, Latah, Swaziland, 183038               | true                                    | Actually St 3459, Moga, Sri Lanka, 866333                     | 0112345679          | TrustBank                | A123456789019 | 20-10563145-9                  | 1234 4321 1234 4329         | No  | https://hdtvpdtnx.awo        | This is a note #10 | Vander #10 | Medarda #10 | Victor #10 | Jayce #10 | Mecaela Stoneburner | Cyber Security(CIA Triad)   |