package com.ssajudn.portalunpab.dummy_data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.ChatBubble
import androidx.compose.material.icons.filled.ChatBubbleOutline
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material.icons.filled.FileCopy
import androidx.compose.material.icons.filled.Print
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.SupportAgent
import androidx.compose.material.icons.outlined.ChatBubble
import androidx.compose.material.icons.outlined.ChatBubbleOutline
import androidx.compose.material.icons.outlined.FileCopy
import androidx.compose.material.icons.outlined.Print
import androidx.compose.material.icons.outlined.Quiz
import androidx.compose.material.icons.outlined.Task
import androidx.compose.ui.graphics.vector.ImageVector
import com.ssajudn.portalunpab.navigation.Screen

data class Menu(
    val title: String,
    val subMenus: List<SubMenu>
)

data class SubMenu(
    val title: String,
    val screenName: String,
    val icon: ImageVector
)

val menuList = listOf(
    Menu(
        title = "Menu Utama",
        subMenus = listOf(
            SubMenu(
                title = "Peserta Kelas",
                screenName = Screen.PesertaKelasScreen.route,
                icon = Icons.Filled.CalendarMonth
            ),
            SubMenu(
                title = "Rencana Studi",
                screenName = Screen.RencanaStudiScreen.route,
                icon = Icons.Filled.CreditCard
            ),
            SubMenu(
                title = "Hasil Studi",
                screenName = Screen.HasilStudiScreen.route,
                icon = Icons.Outlined.FileCopy
            ),
            SubMenu(
                title = "Pencetakan Kartu Ujian",
                screenName = Screen.KartuUjianScreen.route,
                icon = Icons.Outlined.Print
            ),
        )
    ),
    Menu(
        title = "Virtual Class",
        subMenus = listOf(
            SubMenu(
                title = "Materi Kuliah Online",
                screenName = Screen.MateriOnlineScreen.route,
                icon = Icons.Outlined.Task
            ),
            SubMenu(title = "Kuis", screenName = Screen.QuizScreen.route, icon = Icons.Outlined.Quiz),
            SubMenu(
                title = "Bimbingan Akademik",
                screenName = Screen.BimbinganAKScreen.route,
                icon = Icons.Outlined.ChatBubbleOutline
            )
        )
    )
)