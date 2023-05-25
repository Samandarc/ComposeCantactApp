package uz.gita.composecantactapp.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import uz.gita.composecantactapp.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactItem(
    @DrawableRes image: Int = R.drawable.ic_launcher_foreground,
    name: String,
    number: String,
    stateRadioButton: Boolean = true
) {
    Card(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp), ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        )
        {

            Image(
                modifier = Modifier
                    .size(100.dp)
                    .padding(12.dp),
                painter = painterResource(id = image),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .width(0.dp)
                    .weight(1f),
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Text(text = name, modifier = Modifier.padding(top = 16.dp))
                Spacer(
                    modifier = Modifier
                        .height(0.dp)
                        .weight(1f)
                )
                Text(text = number, modifier = Modifier.padding(bottom = 16.dp))
            }

            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(40.dp),
                contentAlignment = Alignment.Center
            ) {
                RadioButton(selected = stateRadioButton, onClick = {

                })
            }
        }
    }
}

