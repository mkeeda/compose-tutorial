package com.mkeeda.composetutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.LayoutSize
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Card
import androidx.ui.material.themeTextStyle
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MyScreenContent()
            }
        }
    }
}

@Composable
fun MyApp(child: @Composable() () -> Unit) {
    MaterialTheme {
        child()
    }
}

@Composable
fun MyScreenContent() {
    VerticalScroller {
        Column(modifier = Spacing(8.dp)) {
            NewsStory()
            HeightSpacer(height = 16.dp)
            NewsStory()
            HeightSpacer(height = 16.dp)
            NewsStory()
        }
    }
}

@Composable
fun NewsStory() {
    val image = +imageResource(R.drawable.header)

    Card(elevation = 2.dp, shape = RoundedCornerShape(4.dp)) {
        Column(
            crossAxisSize = LayoutSize.Expand,
            modifier = Spacing(16.dp)
        ) {
            Container(expanded = true, height = 180.dp) {
                Clip(shape = RoundedCornerShape(8.dp)) {
                    DrawImage(image = image)
                }
            }

            HeightSpacer(height = 16.dp)

            Text(text = "A day wandering through the sandhills in Shark " +
                    "Fin Cove, and a few of the sights I saw",
                maxLines = 2, overflow = TextOverflow.Ellipsis,
                style = (+themeTextStyle { h6 }).withOpacity(0.87f))
            Text(text = "Davenport, California",
                style = (+themeTextStyle { body2 }).withOpacity(0.87f))
            Text(text = "December 2018",
                style = (+themeTextStyle { body2 }).withOpacity(0.6f))
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApp {
        MyScreenContent()
    }
}
