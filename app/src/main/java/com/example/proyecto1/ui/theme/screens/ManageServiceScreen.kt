package com.example.proyecto1.ui.theme.screens

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.proyecto1.data.controller.ServiceViewModel
import com.example.proyecto1.data.model.ServiceModel

fun ManageServiceScreen(
    serviceId: String?, viewModel: ServiceViewModel = viewModel()
) {
    val service = remember { mutableStateOf(ServiceModel()) }



    if (serviceId != null && serviceId != "0") {
        bar.tittle = "Update service"
        viewModel.showService(serviceId.toInt()) { response ->
            if (response.isSuccessful) {
                service.value.name = response.body()?.name.toString()
                service.value.username = response.body()?.usernme.toString()
                service.value.password = response.body()?.password.toString()
                service.value.description = response.body()?.description.toString()
            } else {
                Toast.makeText(
                    context,
                    "Failed to load Service",
                    Toast.LENGTH_SHORT
                )
            }
        }
    }

    Scaffold(
        topBar = { TopBar(bar_tittle, navController, true) },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background()
                .padding()
        ) {
            Spacer(
                modifier = Modifier
                    .padding(0.dp, 5.dp)
            )
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = service.value.name,
                maxLines = 1,
                onValueChange = {
                    service.value = service.value.copy(name = it)
                },
                label = { Text("Service name") },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color.White,
                    focusedBorderColor = colorResource(R.color.primary_button),
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = colorResource(R.color.darkBG),
                    unfocusedTextColor = Color.White,
                    unfocusedLabelColor = Color.White,
                    unfocusedSupportingTextColor = Color.LightGray,
                    focusedTextColor = Color.White,
                    focusedLabelColor = Color.White
                ),
            ) OutlinedTextField (modifier = Modifier.fillMaxWidth(),
            value = service.value.username,
            maxLines = 1,
            onValueChange = {
                service.value = service.value.copy(username = it)
            },
            label = { Text("Username") },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.White,
                focusedBorderColor = colorResource(R.color.primary_button),
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = colorResource(R.color.darkBG),
                unfocusedTextColor = Color.White,
                unfocusedLabelColor = Color.White,
                unfocusedSupportingTextColor = Color.LightGray,
                focusedTextColor = Color.White,
                focusedLabelColor = Color.White
            ),
            )
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = service.value.password,
                maxLines = 1,
                onValueChange = {
                    service.value = service.value.copy(password = it)
                },
                label = { Text("Password") },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color.White,
                    focusedBorderColor = colorResource(R.color.primary_button),
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = colorResource(R.color.darkBG),
                    unfocusedTextColor = Color.White,
                    unfocusedLabelColor = Color.White,
                    unfocusedSupportingTextColor = Color.LightGray,
                    focusedTextColor = Color.White,
                    focusedLabelColor = Color.White
                ),
            )
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = service.value.description,
                maxLines = 1,
                onValueChange = {
                    service.value = service.value.copy(description = it)
                },
                label = { Text("Description") },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color.White,
                    focusedBorderColor = colorResource(R.color.primary_button),
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = colorResource(R.color.darkBG),
                    unfocusedTextColor = Color.White,
                    unfocusedLabelColor = Color.White,
                    unfocusedSupportingTextColor = Color.LightGray,
                    focusedTextColor = Color.White,
                    focusedLabelColor = Color.White
                ),
            )
            FilledTonalButton(
                colors = ButtonDefaults
                    .buttonColors(
                        containerColor = colorResource(R.color.primary_button),
                        contentColor = Color.Black,
                    ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 10.dp),
                shape = CutCornerShape(4.dp),
                onClick = {
                    val serviceTemp = ServiceModel(
                        name = service.value.name,
                        username = service.value.username,
                        password = service.value.password,
                        description = service.value.description
                    ) save (viewModel,
                    context,
                    serviceTemp,
                    serviceId)
                }) {
                if (serviceId == "0") {
                    Text("CREATE SERVICE")
                } else {
                    Text("SAVE CHANGES")
                }
            }
        }
        if (serviceId != null && serviceId.toInt() > 0) {
            OutlinedButton(
                border = BorderStroke(
                    width = 3.dp,
                    color = colorResource(R.color.primary_button)
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.White,
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 10.dp),
                shape = CutCornerShape(4.dp),
                onClick = {
                    delete(
                        viewModel,
                        context,
                        serviceId,
                        navController
                    )
                }) { Text("DELETE") }
        }
    }

    fun save(viewModel: ServiceViewModel, context: Context, service: ServiceModel, serviceId: String? )
    {    if (serviceId == "0")
    {
        viewModel.createService(service) { response ->
            if (response.isSuccessful) {
                Toast.makeText(
                    context,
                    "Service created successfully",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    context,
                    "Error: $${response.body()}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    } else if (serviceId != null){
        viewModel.updateService(serviceId.toInt(), service) { response ->
            if (response.isSuccessful) {
                Toast.makeText(
                    context,
                    "Service updated successfully",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    context,
                    "Error: $${response.body()}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }


    fun delete(viewModel: ServiceViewModel, context: Context, serviceId: String?, navController: NavController)
    {
        if (serviceId != null && serviceId != "0")
        {
            viewModel.deleteService(serviceId.toInt()) { response ->
                if (response.isSuccessful) {
                    Toast.makeText(
                        context,
                        "Service deleted successfully",
                        Toast.LENGTH_SHORT
                    ).show()
                    navController.popBackStack()
                } else {
                    Toast.makeText(
                        context,
                        "Failed to delete service",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}
































