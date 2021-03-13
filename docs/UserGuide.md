---
layout: page
title: User Guide
---

###  Done by (CS2103-T14-2):
Donavan Lim, Marcus Lee Eugene, Chong Sidney, Dinesh S/O Magesvaran, Prabhakaran Gokul

---

* Table of Contents
{:toc}
  
    * Description
    * Features
        * add
        * delete
        * list
    * Command Summary
    * UI mock-up
    
--------------------------------------------------------------------------------------------------------------------
## Description

The Food Diary is a desktop app for managing food diary entries, optimized with a Command Line Interface (CLI) and packaged with a Graphical User Interface (GUI).

The Food Diary caters to food-passionate NUS students who would ideally benefit from keeping records of food options tasted in the vicinity of NUS.

The Food Diary will allow students to save time and effort when finding places to 
eat around the NUS vicinity. The Food Diary especially caters to students chiefly on 3 aspects:
1. The ability for users to log personal food reviews tagged under different categories for future reference.
2. The ability to effortlessly reference food options based on relevant filters in a user-friendly GUI
3. The ability to import and export their personal food diary to share with friends.

--------------------------------------------------------------------------------------------------------------------

## Features

### View all the food reviews : `list`

Lists all the restaurants with food reviews.

Format: `list`

Parameter: none

Example:
(Refer to mockup)

### Add a food review: `add`

Adds a food review to the Food Diary.

<<<<<<< HEAD
Format: `add n/<RESTAURANT NAME> a/ADDRESS re/REVIEW c/CATEGORIES`   
=======
Format: `add n/<RESTAURANT NAME> ra/RATING a/ADDRESS d/DESCRIPTION c/CATEGORIES`   
>>>>>>> master
    
Parameters:
    
   1. `Name (of restaurant)`
<<<<<<< HEAD
   2. `Address`
   3. `Review of food experience`
   4. `Categories (tag)`

Example:
    
    add  n/Al Amaan Restaurant a/12 Clementi Rd, Singapore 129742 re/best for Butter Chicken c/Indian Muslim 
=======
   2. `Rating`  
   3. `Address`
   4. `Description/review`
   5. `Categories (tag)`

Example:
    
    add  n/Al Amaan Restaurant ra/5 a/12 Clementi Rd, Singapore 129742 d/best for Butter Chicken c/Indian Muslim 
>>>>>>> master
    
    
### Delete a food review: `delete`
    
Deletes a food review from the Food Diary.

Format: `delete n/NAME` or `delete i/INDEX`

Parameter: `Restaurant name` or `Index`
   
Example:
   
    delete n/McDonald’s Clementi Mall

-------------------------------------------------------------------------------------

## Command summary

Action | Format, Examples
--------|------------------
<<<<<<< HEAD
**Add** | `add n/<RESTAURANT NAME> a/ADDRESS re/REVIEW c/CATEGORIES` <br> e.g., `add  n/Al Amaan Restaurant a/12 Clementi Rd, Singapore 129742 re/best for Butter Chicken c/Indian Muslim`
=======
**Add** | `add n/<RESTAURANT NAME> ra/5 a/ADDRESS d/DESCRIPTION c/CATEGORIES` <br> e.g., `add  n/Al Amaan Restaurant a/12 Clementi Rd, Singapore 129742 d/best for Butter Chicken c/Indian Muslim`
>>>>>>> master
**Delete** | `delete n/NAME or delete i/INDEX` <br> e.g., `delete n/Al Amaan Restaurant or delete i/1`
**List** | `list`

## <center> Appendix </center> 

### UI Mock-up 

![Ui Mock-up](images/Ui.png)
