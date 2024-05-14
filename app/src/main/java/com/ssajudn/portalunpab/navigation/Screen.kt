package com.ssajudn.portalunpab.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Payments
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Payments
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String) {
    data object HomeScreen : Screen("home")

    //    data object LoginScreen : Screen("login")
    data object UserScreen : Screen("user")
    data object PaymentScreen : Screen("payment")
    data object MenuScreen : Screen("menu")
    data object RencanaStudiScreen : Screen("rencana_studi")
    data object PesertaKelasScreen : Screen("peserta_kelas")
    data object KartuUjianScreen : Screen("kartu_ujian")
    data object HasilStudiScreen : Screen("hasil_studi")
    data object BimbinganAKScreen : Screen("bimbingan_ak")
    data object MateriOnlineScreen : Screen("materi_online")
    data object QuizScreen : Screen("quiz")
}

sealed class Tab(
    val route: String,
    val icon: ImageVector,
    val selectedIcon: ImageVector,
    val label: String
) {
    data object Home : Tab(
        route = "home_tab",
        icon = BottomAppBarIcons.HomeOutlined,
        selectedIcon = BottomAppBarIcons.HomeFilled,
        label = "Beranda"
    )

    data object Payment : Tab(
        route = "payment_tab",
        icon = BottomAppBarIcons.paymentOutlined,
        selectedIcon = BottomAppBarIcons.paymentFilled,
        label = "Pembayaran"
    )

    data object User : Tab(
        route = "user_tab",
        icon = BottomAppBarIcons.userOutlined,
        selectedIcon = BottomAppBarIcons.userFilled,
        label = "Pengguna"
    )
}

private object BottomAppBarIcons {
    val HomeFilled = Icons.Filled.Home
    val HomeOutlined = Icons.Outlined.Home

    val paymentFilled = Icons.Filled.Payments
    val paymentOutlined = Icons.Outlined.Payments

    val userFilled = Icons.Filled.AccountCircle
    val userOutlined = Icons.Outlined.AccountCircle
}

val bottomNavBarTabs = listOf(
    Tab.Home,
    Tab.Payment,
    Tab.User
)