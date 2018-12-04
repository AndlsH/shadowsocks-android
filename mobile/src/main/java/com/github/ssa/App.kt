/*******************************************************************************
 *                                                                             *
 *  Copyright (C) 2017 by Max Lv <max.c.lv@gmail.com>                          *
 *  Copyright (C) 2017 by Mygod Studio <contact-shadowsocks-android@mygod.be>  *
 *                                                                             *
 *  This program is free software: you can redistribute it and/or modify       *
 *  it under the terms of the GNU General Public License as published by       *
 *  the Free Software Foundation, either version 3 of the License, or          *
 *  (at your option) any later version.                                        *
 *                                                                             *
 *  This program is distributed in the hope that it will be useful,            *
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of             *
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the              *
 *  GNU General Public License for more details.                               *
 *                                                                             *
 *  You should have received a copy of the GNU General Public License          *
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.       *
 *                                                                             *
 *******************************************************************************/

package com.github.ssa

import android.app.Application
import android.content.res.Configuration
<<<<<<< HEAD:mobile/src/main/java/com/github/ssa/App.kt
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.os.UserManager
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatDelegate
import android.util.Log
import android.widget.Toast
import com.evernote.android.job.JobConstants
import com.evernote.android.job.JobManager
import com.evernote.android.job.JobManagerCreateException
import com.github.ssa.acl.Acl
import com.github.ssa.acl.AclSyncJob
import com.github.ssa.bg.BaseService
import com.github.ssa.database.Profile
import com.github.ssa.database.ProfileManager
import com.github.ssa.preference.BottomSheetPreferenceDialogFragment
import com.github.ssa.preference.DataStore
import com.github.ssa.preference.IconListPreference
import com.github.ssa.utils.*
import com.google.android.gms.analytics.GoogleAnalytics
import com.google.android.gms.analytics.HitBuilders
import com.google.android.gms.analytics.StandardExceptionParser
import com.google.android.gms.analytics.Tracker
import com.google.firebase.FirebaseApp
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.j256.ormlite.logger.LocalLog
import com.takisoft.fix.support.v7.preference.PreferenceFragmentCompat
import java.io.File
import java.io.IOException
=======
import androidx.appcompat.app.AppCompatDelegate
import com.github.ssa.preference.BottomSheetPreferenceDialogFragment
import com.github.ssa.preference.IconListPreference
import com.takisoft.preferencex.PreferenceFragmentCompat
>>>>>>> upstream/master:mobile/src/main/java/com/github/shadowsocks/App.kt

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Core.init(this, MainActivity::class)
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        PreferenceFragmentCompat.registerPreferenceFragment(IconListPreference::class.java,
                BottomSheetPreferenceDialogFragment::class.java)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Core.updateNotificationChannels()
    }
}
