# College-Link-Final-Project

-----------------------------------------------------------------------------------------------------------------
Project description in English/Greek - Περιγραφή του project αγγλικά/ελληνικά
-----------------------------------------------------------------------------------------------------------------

English description:

PART 1

Task 1: 
Create a Maven automation testing project:

a) Create a new maven project in IntelliJ with the title: "web-automation testing".

b) Declare Java version 17 or newer in your project.

c) Use the TestNG tool as a testing framework for performing automated tests.

d) Use the Selenium WebDriver tool to create the automated tests.

e) Use the Allure tool as a reporting tool.

Task 2:
Create automated test scenarios:


a) Create the first test scenario that will do the following:

i. It will go to the amazon home page : https://www.amazon.com

ii. It will type in the search bar on the top of the page: lg tv 65 and click search.

iii. From the page of TVs that comes up, he will select the third item in order of appearance.

iv. On the next page that will appear with the detailed ones he will do:

Assert the Screen Size = 65 inches

Assert that the Brand is LG

b) Create the second test scenario that will do the following:

i. It will go to the home page of skroutz : https://www.skroutz.gr/

ii. It will search in the search bar for iphone13.

iii. It will select from the left filter bar, the filter: Screen 6.0¨ - 6.4¨.

iv. From the results in the list he will click on the mobile phone titled: Apple iPhone 13 5G (4GB/128GB) Midnight.

v. And in the new page that will open up do assert:

That the title of the mobile is: Apple iPhone 13 5G (4GB/128GB) Midnight.

That in the basic features it says: 5G connectivity network

Task 3: Execute test scenarios:
After the two automated test cases have been implemented to execute these tests you need to build a suite (testing.xml) that will run the two tests in parallel.


PART 2

Create Api test with postman.

Scenario: 

Create a postman collection named "api-automation- testing", which will contains the following 2 requests:


Task 1:
A "GET" http call to genderize Api with name parameter maria where via postman test to the following are authenticated:

a) Step1: Certify that the response from this call is code = 200 or 'OK'.

b) Step2: Verify that the values of the json attributes that Api spins have specific data type and specifically that:

i. The name is string type

ii. gender is string type

iii. and probability, count are of type number.

c) Step3: To certify the values of the attributes

i. name = maria

ii. gender = female

Task 2:
A second "GET" http call to the genderize Api with the names peter and maria as parameters where via postman test to authenticate the following:

a) Step1: Certify that the response from this call is code = 200 or 'OK'.

b) Step2: Certify that the response from Api is data type = array.

c) Step3: Certify the values of the 2 json attributes inside the json array:

i. For the first json of the array is name = peter and gender = male.

ii. For the second json of the array is name = maria and gender = female.

-----------------------------------------------------------------------------------------------------------------

Περιγραφή στα ελληνικά:

ΜΕΡΟΣ 1

Ζητούμενο 1:
Να δημιουργηθεί ένα Maven automation testing project:


a) Να δημιουργήσετε ένα καινούργιο maven project στο IntelliJ με τίτλο: "web-automationtesting".

b) Να δηλώσετε στο project σας Java version 17 ή και κάποια πιο καινούργια.

c) Να χρησιμοποιήσετε σαν testing framework για την εκτέλεση των αυτοματοποιημένων 
δοκιμών το εργαλείο TestNG.

d) Να χρησιμοποιήσετε για να δημιουργήσετε τα automated tests το εργαλείο Selenium
WebDriver.

e) Να χρησιμοποιήσετε σαν reporting tool το εργαλείο Allure.


Ζητούμενο 2: 
Να δημιουργηθεί ένα automated test scenarios:


a) Να δημιουργήσετε το πρώτο τεστ σενάριο που θα κάνει τα εξής:

i. Θα πηγαίνει στο στην αρχική σελίδα της amazon : https://www.amazon.com

ii. Θα γράφει στην search bar που υπάρχει πάνω στην σελίδα: lg tv 65 και θα 
πατάει search.

iii. Από την σελίδα των TVs που θα εμφανιστεί θα επιλέγει το τρίτο κατά σειρά 
εμφάνισης αντικείμενο.

iv. Στην επόμενη σελίδα που θα εμφανιστεί με τις λεπτομερείς θα κάνει:

1. Assert το Screen Size = 65 inches
   
3. Assert ότι το Brand είναι LG
   
b) Να δημιουργήσετε το δεύτερο τεστ σενάριο που θα κάνει τα εξής:

i. Θα πηγαίνει στο στην αρχική σελίδα του skroutz : https://www.skroutz.gr/

ii. Θα κάνει search στο search bar για iphone13.

iii. Θα επιλέγει από την αριστερή bar με τα φίλτρα, το φίλτρο: Οθόνη 6.0¨ -
6.4¨.

iv. Από τα αποτελέσματα στην λίστα θα κάνει click στο κινητό με τίτλο: Apple
iPhone 13 5G (4GB/128GB) Midnight.

v. Και στην νέα σελίδα που θα ανοίξει να κάνει assert:

1. Ότι ο τίτλος του κινητού είναι: Apple iPhone 13 5G (4GB/128GB) 
Midnight.

3. Ότι στα βασικά χαρακτηριστικά λέει: Δίκτυο σύνδεσης 5G
 
Ζητούμενο 3: 
Εκτέλεση test scenarios:

Αφού υλοποιηθούν τα δύο automated test cases για να εκτελεστούν αυτές οι δοκιμές πρέπει να φτιάξετε 
μια suite (testing.xml) η οποία θα εκτελεί τις δυο δοκιμές παράλληλα.


ΜΕΡΟΣ 2

Δημιουργία Api test με το postman.

Σενάριο: 

Να δημιουργηθεί ένα postman collection με όνομα "api-automation- testing", το οποίο θα
περιέχει το εξής 2 requests:


Ζητούμενο 1:
Eνα "GET" http call στο genderize Api με name παράμετρο το όνομα maria όπου μέσω postman test να 
πιστοποιηθούν τα εξής:

a) Βήμα1: Να πιστοποιηθεί ότι το response από το συγκεκριμένο call είναι code = 200 ή ‘ΟΚ’.

b) Βήμα2: Να πιστοποιηθεί ότι τα values των json attributes που γυρνάει το Api έχουν 
συγκεκριμένο data type και ποιο συγκεκριμένα ότι:

i. Το name είναι τύπου string

ii. Το gender είναι τύπου string

iii. Και τα probability, count είναι τύπου number.

c) Βήμα3: Να πιστοποιηθούν τα values των attributes

i. name = maria

ii. gender = female


Ζητούμενο 2:
Eνα δεύτερο "GET" http call στο genderize Api με παράμετρο τα ονόματα peter και maria όπου μέσω 
postman test να πιστοποιηθούν τα εξής:

a) Βήμα1: Να πιστοποιηθεί ότι το response από το συγκεκριμένο call είναι code = 200 ή ‘ΟΚ’.

b) Βήμα2: Να πιστοποιηθεί ότι το response του Api είναι data type = array.

c) Βήμα3: Να πιστοποιηθούν τα values των 2 json attributes μέσα στο json array:

i. Για το πρώτο json του array είναι name = peter και gender = male.

ii. Για το δεύτερο json του array είναι name = maria και gender = female.

-----------------------------------------------------------------------------------------------------------------
