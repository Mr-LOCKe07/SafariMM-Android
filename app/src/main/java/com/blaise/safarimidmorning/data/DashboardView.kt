package com.blaise.safarimidmorning.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.blaise.safarimidmorning.model.DashboardStat
import com.blaise.safarimidmorning.model.QuickAction
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DashboardViewModel: ViewModel(){

    val _stats= MutableStateFlow(
        listOf(
            DashboardStat("Revenue","1200", Icons.Default.Phone, Color.Magenta),
            DashboardStat("User","1456",Icons.Default.Person,Color.Cyan)
        )
    )
    val stats:StateFlow<List<DashboardStat>>get()=_stats

    private val _quickaction=MutableStateFlow(
        listOf(
            QuickAction("Add new user",Icons.Default.Person),
            QuickAction("Generate report",Icons.Default.AccountCircle),
            QuickAction("Settings",Icons.Default.Settings)
        )
    )
    val quickaction:StateFlow<List<QuickAction>>get()=_quickaction
}
