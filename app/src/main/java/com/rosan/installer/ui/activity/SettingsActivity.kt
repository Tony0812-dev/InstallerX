package com.rosan.installer.ui.activity

import android.content.Context
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.edit
import androidx.core.text.HtmlCompat
import com.rosan.installer.R
import com.rosan.installer.ui.page.settings.SettingsPage
import com.rosan.installer.ui.theme.InstallerTheme
import org.koin.core.component.KoinComponent

class SettingsActivity : ComponentActivity(), KoinComponent {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // A surface based on material design theme.
            InstallerTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .imePadding()
                ) {
                    SettingsPage()
                }
            }
        }
    }

}