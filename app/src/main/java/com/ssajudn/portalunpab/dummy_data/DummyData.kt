package com.ssajudn.portalunpab.dummy_data

import com.ssajudn.portalunpab.navigation.Screen

data class Menu(
    val title: String,
    val subMenus: List<SubMenu>
)

data class SubMenu(
    val title: String,
    val screenName: String
)

val menuList = listOf(
    Menu(
        title = "Menu Utama",
        subMenus = listOf(
            SubMenu(title = "Peserta Kelas", screenName = Screen.PesertaKelasScreen.route),
            SubMenu(title = "Rencana Studi", screenName = Screen.RencanaStudiScreen.route),
            SubMenu(title = "Hasil Studi", screenName = Screen.HasilStudiScreen.route),
            SubMenu(title = "Pencetakan Kartu Ujian", screenName = Screen.KartuUjianScreen.route),
        )
    ),
    Menu(
        title = "Virtual Class",
        subMenus = listOf(
            SubMenu(title = "Materi Kuliah Online", screenName = Screen.MateriOnlineScreen.route ),
            SubMenu(title = "Kuis", screenName = Screen.QuizScreen.route),
            SubMenu(title = "Bimbingan Akademik", screenName = Screen.BimbinganAKScreen.route)
        )
    )
)