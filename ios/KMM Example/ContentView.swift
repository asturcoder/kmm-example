//
//  ContentView.swift
//  KMM Example
//
//  Created by Felipe Joglar on 27/10/2021.
//

import SwiftUI
import shared

struct ContentView: View {
    
    let greeting = Greeting().greeting()
    
    var body: some View {
        Text(greeting)
            .padding()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
