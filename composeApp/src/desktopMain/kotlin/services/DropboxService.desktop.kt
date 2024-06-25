package services

import com.dropbox.core.DbxAppInfo
import com.dropbox.core.DbxPKCEWebAuth
import com.dropbox.core.DbxRequestConfig
import com.dropbox.core.DbxSessionStore
import com.dropbox.core.DbxWebAuth
import com.dropbox.core.TokenAccessType

actual fun authenticate() {
    val appInfo = DbxAppInfo("rfhw7ln1ri2ttd8")
    val requestConfig = DbxRequestConfig.newBuilder("Compose_MP_Experiment")
        .withUserLocaleFromPreferences().build()
    val pkceWebAuth = DbxPKCEWebAuth(requestConfig, appInfo)
    
    val webAuthRequest =  DbxWebAuth.newRequestBuilder()
        .withRedirectUri("http://localhost:2356/", YamlSessionStore())
        .withTokenAccessType(TokenAccessType.OFFLINE)
        .build()
}