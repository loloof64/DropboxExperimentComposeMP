package services

import com.dropbox.core.DbxSessionStore
import com.charleskorn.kaml.Yaml
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.decodeFromString

@Serializable
private data class StringMap(val map: Map<String, String>)

class YamlSessionStore : DbxSessionStore {
    override fun get(): String {
        TODO("Not yet implemented")
    }

    override fun set(value: String?) {
        TODO("Not yet implemented")
    }

    override fun clear() {
        TODO("Not yet implemented")
    }
    
    private fun updateValues() {
        Yaml.default.encodeToString()
    }

    private val values = mutableMapOf<String, String>()
}