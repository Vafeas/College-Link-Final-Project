# College-Link-Final-Project

-----------------------------------------------------------------------------------------------------------------

PART 1

Task 1: 
Create Maven automation testing project:


a) Να δημιουργήσετε ένα καινούργιο maven project στο IntelliJ με τίτλο: "web-automationtesting".

b) Να δηλώσετε στο project σας Java version 17 ή και κάποια πιο καινούργια.

c) Να χρησιμοποιήσετε σαν testing framework για την εκτέλεση των αυτοματοποιημένων 
δοκιμών το εργαλείο TestNG.

d) Να χρησιμοποιήσετε για να δημιουργήσετε τα automated tests το εργαλείο Selenium
WebDriver.

e) Να χρησιμοποιήσετε σαν reporting tool το εργαλείο Allure.


Task 2: 
Create automated test scenarios:


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
 
Task 3: 
Execute test scenarios:

Αφού υλοποιηθούν τα δύο automated test cases για να εκτελεστούν αυτές οι δοκιμές πρέπει να φτιάξετε 
μια suite (testing.xml) η οποία θα εκτελεί τις δυο δοκιμές παράλληλα.

-----------------------------------------------------------------------------------------------------------------

PART 2

Create Api test with postman.

Scenario: 

Να δημιουργηθεί ένα postman collection με όνομα "api-automation- testing", το οποίο θα
περιέχει το εξής 2 requests:


Task 1:
Eνα "GET" http call στο genderize Api με name παράμετρο το όνομα maria όπου μέσω postman test να 
πιστοποιηθούν τα εξής:

a) Step1: Να πιστοποιηθεί ότι το response από το συγκεκριμένο call είναι code = 200 ή ‘ΟΚ’.

b) Step2: Να πιστοποιηθεί ότι τα values των json attributes που γυρνάει το Api έχουν 
συγκεκριμένο data type και ποιο συγκεκριμένα ότι:

i. Το name είναι τύπου string

ii. Το gender είναι τύπου string

iii. Και τα probability, count είναι τύπου number.

c) Step3: Να πιστοποιηθούν τα values των attributes

i. name = maria

ii. gender = female


Task 2:
Eνα δεύτερο "GET" http call στο genderize Api με παράμετρο τα ονόματα peter και maria όπου μέσω 
postman test να πιστοποιηθούν τα εξής:

a) Step1: Να πιστοποιηθεί ότι το response από το συγκεκριμένο call είναι code = 200 ή ‘ΟΚ’.

b) Step2: Να πιστοποιηθεί ότι το response του Api είναι data type = array.

c) Step3: Να πιστοποιηθούν τα values των 2 json attributes μέσα στο json array:

i. Για το πρώτο json του array είναι name = peter και gender = male.

ii. Για το δεύτερο json του array είναι name = maria και gender = female.

-----------------------------------------------------------------------------------------------------------------
