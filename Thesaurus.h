#ifndef THESAURUS_THESAURUS_H
#define THESAURUS_THESAURUS_H

#pragma once
#include <iostream>
#include <vector>

using namespace std;

class Thesaurus {

    private:
        vector< vector<string> > mockDataBase;
        vector< vector<string> >* pMockDataBase = &mockDataBase;
        vector<string> allWords;
        vector<string>* pAllWords = &allWords;
        vector<string> synonyms;
        vector<string>* pSynonyms = &synonyms;

    public:

        Thesaurus(){
        }
        ~Thesaurus(){
        }

        //Adds the given synonyms to the thesaurus
        void AddSynonyms(vector<string>* pSynonyms){
            (*pMockDataBase).push_back(*pSynonyms);
        }

        //Gets the synonyms for a given word
        vector<string>* GetSynonyms(string word) {
            for(vector<string> potentialSynonyms : *pMockDataBase) {
                for(string synonym : potentialSynonyms) {
                    if(word == synonym) {
                        *pSynonyms = potentialSynonyms;
                        return pSynonyms;
                    }
                }
            }
            return pSynonyms;
        }

        //Gets all words from the thesaurus
        vector<string>* GetAllWords() {
            for(vector<string> synonyms : *pMockDataBase) {
                for(string word : synonyms) {
                    (*pAllWords).push_back(word);
                }
            }
            return pAllWords;
        }
};

#endif //THESAURUS_THESAURUS_H
