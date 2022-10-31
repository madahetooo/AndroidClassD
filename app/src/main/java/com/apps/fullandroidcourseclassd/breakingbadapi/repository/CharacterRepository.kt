package com.apps.fullandroidcourseclassd.breakingbadapi.repository

import androidx.lifecycle.LiveData
import com.apps.fullandroidcourseclassd.breakingbadapi.db.CharacterDao
import com.apps.fullandroidcourseclassd.breakingbadapi.model.BreakingBadCharacter
import com.apps.fullandroidcourseclassd.breakingbadapi.service.BreakingBadNetwork
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CharacterRepository(private val characterDao: CharacterDao) {
    //GETTING LIST FROM LOCAL DB
    var characters:LiveData<List<BreakingBadCharacter>> = characterDao.findAllCharacters()

//     fun refreshCharacter(){
//        // Getting the list from API
//        val characterList = BreakingBadNetwork.serviceApi.getCharacters()
//
//       //SAVE TO THE LOCAL DATABASE
//        characterDao.insertAllCharacters(characterList)
//    }
    suspend fun refreshCharacter() {
        withContext(Dispatchers.IO) {
            val characters =
                BreakingBadNetwork.serviceApi.getCharacters() //GETTING ALL DATA FROM API
            characterDao.insertAllCharacters(characters) //INSERT DATA TO  LOCAL DATABASE
        }
    }
}