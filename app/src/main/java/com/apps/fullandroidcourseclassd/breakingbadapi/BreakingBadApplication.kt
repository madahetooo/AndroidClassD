package com.apps.fullandroidcourseclassd.breakingbadapi

import android.app.Application
import com.apps.fullandroidcourseclassd.breakingbadapi.db.CharacterDatabase
import com.apps.fullandroidcourseclassd.breakingbadapi.repository.CharacterRepository

class BreakingBadApplication : Application() {

    val database by lazy {
        CharacterDatabase.createDatabase(this)
    }

    val characterRepository by lazy {
        CharacterRepository(database.createCharacterDao())
    }

}