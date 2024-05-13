package com.ssajudn.portalunpab.presentation

//@Composable
//fun LoginScreen(navController: NavController) {
//    StatusBarColor(color = Primary)
//
//    Box(modifier = Modifier.fillMaxSize()) {
//        Canvas(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(130.dp)
//        ) {
//            val topLeft = Offset(0f, 0f)
//            val topRight = Offset(size.width, 0f)
//            val bottomLeft = Offset(0f, size.height)
//            val bottomRight = Offset(size.width, size.height)
//
//            drawPath(
//                path = Path().apply {
//                    moveTo(topLeft.x, topLeft.y)
//                    lineTo(topRight.x, topRight.y)
//                    lineTo(bottomRight.x, bottomRight.y - 200f)
//                    lineTo(bottomLeft.x, bottomLeft.y - 20f)
//                    close()
//                },
//                color = Primary,
//            )
//        }
//
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(horizontal = 30.dp),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.logo_pancabudi),
//                contentDescription = null,
//                modifier = Modifier
//                    .background(Grey, shape = CircleShape)
//                    .padding(25.dp)
//                    .size(130.dp)
//            )
//            Spacer(modifier = Modifier.size(20.dp))
//            TextField()
//            Spacer(modifier = Modifier.size(20.dp))
//            Button(
//                onClick = {
//                    navController.navigate(Screen.HomeScreen.route)
//                },
//                modifier = Modifier.fillMaxWidth(),
//                colors = ButtonDefaults.buttonColors(Primary)
//            ) {
//                Text(text = "Login")
//            }
//        }
//    }
//}