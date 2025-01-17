package pro.inc.wishlistapp

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppBarView(
    title: String,
    onBackNavClicked: () -> Unit= {}
){
    
    val navigationIcon: (@Composable () -> Unit) ? =


        // if we are not on the wishlist screen then show the back button
        if(!title.contains("Wishlist")){
            {
            IconButton(onClick = { onBackNavClicked()}) {
                Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    tint = Color.White,
                    contentDescription = null )

            }
        }

        }else{
            null
        }

    
    TopAppBar(title = { Text(text = title,
        color = colorResource(id = R.color.white),
        modifier = Modifier
            .padding(start = 4.dp)
            .heightIn(min = 24.dp),
        fontSize = 24.sp,

        ) },
        elevation = 3.dp,
        backgroundColor = colorResource(id = R.color.app_bar_color),
        navigationIcon = navigationIcon

    )
    

}