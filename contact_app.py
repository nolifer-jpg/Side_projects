def main(): # The main function that call all the other functions according to the needs of the user
    contacts = {}
    while True:
        inp = int(input("1. Add contact\n2. View All contacts\n3. Search Contact\n4. Delete Contact\n5. Exit\n"))
        if inp == 1:
            add_contact(contacts)
        elif inp == 2:
            view_contacts(contacts)
        elif inp == 3:
            search_contact(contacts)
        elif inp == 4:
            delete_contact(contacts)
        elif inp == 5:
            print("Thanks for using our app!!!")
            break    
        else:
            print("Please select a valid function")

def add_contact(contacts): # Adds New Contact to the dictionary
    name = input("Enter Name: ")
    phone = input("Enter Phone Number: ")
    contacts[name] = phone
    print("Name and Phone number added.")


def view_contacts(contacts): # Shows all the contacts in the dictionary
    if not contacts:
        print("No contacts to show.")
    else:
        for name, phone in contacts.items():
            print(f"{name}: {phone}")



def search_contact(contacts): # Searches the contact needed
    name = input("Name: ")
    if name in contacts:
        print(f"The Phone number of {name}: {contacts[name]}")
    else:
        print("Contact not found.")


def delete_contact(contacts): # Deletes the contact the user wants deleted
    name = input("Who do you want to delete? ")
    if name in contacts:
        contacts.pop(name)
        print(f"{name} deleted.")
    else:
        print("Contact does not exist.")


main() #Calls the main function