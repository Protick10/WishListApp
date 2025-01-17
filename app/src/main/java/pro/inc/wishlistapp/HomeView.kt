package pro.inc.wishlistapp

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun HomeView() {
    val context = LocalContext.current

    Scaffold(
        topBar = { AppBarView(title = "Wishlist", {

            Toast.makeText(context, "Button clicked", Toast.LENGTH_SHORT).show()
        })},
        
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier.padding(24.dp),
                contentColor = Color.Magenta,
                backgroundColor = Color.Gray,
                onClick = {// TODO Add navigation to add screen //
                    Toast.makeText(context, "Button clicked", Toast.LENGTH_SHORT).show()
             }) {

                Icon(imageVector = Icons.Default.Add, contentDescription =null )

            }
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {

        }
    }
}