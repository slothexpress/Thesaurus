#include <iostream>
#include <vector>
#include <string>
#include "Thesaurus.h"

using namespace std;

int main() {
    Thesaurus thesaurus;
    vector<string> demoSynonymsA({"happy", "content"});
    thesaurus.AddSynonyms(&demoSynonymsA);
    vector<string> demoSynonymsB{"important", "essential", "pivotal", "central"};
    thesaurus.AddSynonyms(&demoSynonymsB);

    bool useThesaurus = true;
    char userChoice;
    string searchWord;

    vector<string> result;
    vector<string>* pResult = &result;

    while(useThesaurus) {
        cout << endl;
        cout << "-- AMAZING THESAURUS REX --" << endl;
        cout << "\nWhat would you like to do?" << endl;
        cout << "1. Search synonyms" << endl;
        cout << "2. See all words" << endl;
        cout << "3. Exit programme" << endl;
        cout << "\nEnter 1, 2 or 3: ";

        cin >> userChoice;

        switch(userChoice) {
            case '1':
                cout << "\n** Search synonyms ** \nEnter word: ";
                cin >> searchWord;
                *pResult = *thesaurus.GetSynonyms(searchWord);
                if(result.size() == 0){
                    cout << "\n-- No synonyms found for: " << searchWord << endl;
                } else {
                    cout << "\n-- Synonyms found for: " << searchWord << endl;
                    for(int i = 0; i < result.size(); i++) {
                        if(searchWord != pResult->at(i)) {
                            cout << pResult->at(i) << endl;
                        }
                    };
                };
                break;
            case '2':
                pResult = thesaurus.GetAllWords();
                cout << "\n-- All words: " << endl;
                for(int i = 0; i < (*pResult).size(); i++ ) {
                    cout << pResult->at(i) << endl;
                }
                break;
            case '3':
                useThesaurus = false;
                cout << "\n** Exit thesaurus **" << endl;
                break;
            default:
                cout << "\n** Invalid choice **" << endl;
                break;
        }
    }
    return 0;
}

