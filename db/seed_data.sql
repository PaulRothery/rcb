----------------------------------
-- GRAIN
----------------------------------
DELETE FROM rcb.grain;
INSERT INTO rcb.grain (name, date, supplier, maltster,  category, sack_weight, moisture_content, fgdb, protein_content, initial_quantity, current_quantity) VALUES ('Pilsner, rahr',CURRENT_DATE,'ACME grain supply' ,'Maltster A', 'Pisner',100,16.40,7.82,10.0,100,30);
INSERT INTO rcb.grain (name, date, supplier, maltster,  category, sack_weight, moisture_content, fgdb, protein_content, initial_quantity, current_quantity) VALUES ('Acidulated',CURRENT_DATE,'Another grain supply' ,'Maltster B', 'Acidulated',250,20.30,19.21,14.0,250,40);
INSERT INTO rcb.grain (name, date, supplier, maltster,  category, sack_weight, moisture_content, fgdb, protein_content, initial_quantity, current_quantity) VALUES ('Maris Otter',CURRENT_DATE,'Denver grain supply' ,'Maltster C', 'Otter',120,16.40,7.82,10.0,120,60);
INSERT INTO rcb.grain (name, date, supplier, maltster,  category, sack_weight, moisture_content, fgdb, protein_content, initial_quantity, current_quantity) VALUES ('Crystal Medium',CURRENT_DATE,'ACME grain supply','Maltster D', 'Stout',130,16.40,7.82,10.0,260,50);
INSERT INTO rcb.grain (name, date, supplier, maltster,  category, sack_weight, moisture_content, fgdb, protein_content, initial_quantity, current_quantity) VALUES ('Crystal Dark',CURRENT_DATE,'ACME grain supply'  ,'Maltster E', 'Porter',140,16.40,7.82,10.0,90,10);
INSERT INTO rcb.grain (name, date, supplier, maltster,  category, sack_weight, moisture_content, fgdb, protein_content, initial_quantity, current_quantity) VALUES ('Special Brew',CURRENT_DATE,'Bad Manners'        ,'Maltster F', 'IPA'  ,150,16.40,7.82,10.0,130,20);


----------------------------------
-- HOP
----------------------------------
DELETE FROM rcb.hop;
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Chinook \(20-1\)',CURRENT_DATE,'Billy Goat','BG ###',2021,16.40,7.82,10.0,7.5         );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Citra \(19-2\)',CURRENT_DATE,'YCH','P91-DUCIT4128',2021,13.30,15.25,10.0,7.5          );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Columbus \(20\)',CURRENT_DATE,'Hops Dir.','#111820399023',2021,14.00,6.68,10.0,7.5    );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Columbus \(20-2\)',CURRENT_DATE,'','',2021,0,5.74,10.0,7.5                              );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('El Dorado \(19\)',CURRENT_DATE,'Mill 95','ELD19WO8',2021,15.10,11.30,10.0,7.5         );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Falconers \(18\)',CURRENT_DATE,'YCH','P92-BJUFAL8097',2021,10.90,10.43,10.0,7.5       );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Falconers\(20\)',CURRENT_DATE,'','',2021,0,   0,10.0,7.5                                      );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Fuggle \(17\)',CURRENT_DATE,'YCH','17-0091',2021,4.20,11.75,10.0,7.5                  );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('EKG \(20\)',CURRENT_DATE,'YCH','P92-EEEKG0371',2021,5.90,11.79,10.0,7.5               );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Galaxy \(18-041\)',CURRENT_DATE,'BSG','18P1GAX-VT041',2021,16.60,16.00,10.0,7.5       );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Hallertau Blanc \(18\)',CURRENT_DATE,'MHA','18-436',2021,8.90,9.49,10.0,7.5           );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Hallertau Blanc \(19-1\)',CURRENT_DATE,'YCH','19-399',2021,9.30,14.45,10.0,7.5        );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Hallertau Blanc \(19-2\)',CURRENT_DATE,'YCH','19-620',2021,8.20,14.45,10.0,7.5        );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Hersbrucker \(18\)',CURRENT_DATE,'YCH','18-136',2021,1.90,9.22,10.0,7.5               );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Hersbrucker \(20\)',CURRENT_DATE,'Hollingberry','20-459',2021,4.20,8.92,10.0,7.5      );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Idaho Gem \(19-1\)',CURRENT_DATE,'Mill95','GEM19WO1',2021,0,12.00,10.0,7.5              );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Idaho Gem \(19-2\)',CURRENT_DATE,'Mill95','2561901',2021,13.00,12.00,10.0,7.5         );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Magnum \(20\)',CURRENT_DATE,'MHA','MHA555-20MAG',2021,15.90,9.14,10.0,7.5             );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Magnum \(20-2\)',CURRENT_DATE,'ProHops','20-043',2021,15.70,9.03,10.0,7.5             );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Hallertau Mittelfrueh \(20\)',CURRENT_DATE,'Hopsteiner','',2021,0,0,10.0,7.5              );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Mandarina Bavaria \(20\)',CURRENT_DATE,'HopHavoc','20-615',2021,8.30,10.73,10.0,7.5   );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Mosaic \(18\)',CURRENT_DATE,'YCH','P91-CAUMOS3201',2021,12.50,13.95,10.0,7.5          );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Motueka \(19\)',CURRENT_DATE,'BSG','19N2MOT11',2021,0,16.25,10.0,7.5                    );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Motueka \(20\)',CURRENT_DATE,'BSG','20N1MOT11',2021,5.70,16.40,10.0,7.5               );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Northern Brewer \(17\)',CURRENT_DATE,'YCH','17-574',2021,8.20,8.78,10.0,7.5           );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Rakau \(20\)',CURRENT_DATE,'BSG','20N1RAK44',2021,8.60,14.75,10.0,7.5                 );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Saaz \(20\)',CURRENT_DATE,'MHA','MHA ###',2021,2.60,11.63,10.0,7.5                    );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Saaz \(20-1\)',CURRENT_DATE,'','',2021,0,12.08,10.0,7.5                                 );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Simcoe \(20\)',CURRENT_DATE,'YCH','P91-EUSIM0286',2021,12.90,14.93,10.0,7.5           );
INSERT INTO rcb.hop (name, date, supplier, lot_number, crop_year, price, alpha, initial_quantity, current_quantity) VALUES ('Simcoe \(20-1\)',CURRENT_DATE,'','',2021,0,  0,10.0,7.5                                       );

----------------------------------
-- YEAST
----------------------------------
DELETE FROM rcb.yeast;
INSERT INTO rcb.yeast (strain, date        , supplier    , lot_number, brand, previous_batch_id, previous_batch_brand, generation, vessel_location, cell_count, viability, quantity)
               VALUES ('I008', CURRENT_DATE, 'ABC Supply', '1234'    , 'XXX', '2010'           , 'YYY'               , 1         , 'YV2'          , 1.36      , 79       , 5);


----------------------------------
-- BREWER
----------------------------------
DELETE FROM rcb.brewer;
INSERT INTO rcb.brewer (name, email) VALUES ('Matt', 'matt@rcb.com');
INSERT INTO rcb.brewer (name, email) VALUES ('Jordan', 'jordan@rcb.com');
INSERT INTO rcb.brewer (name, email) VALUES ('K8', 'k8@rcb.com');


----------------------------------
-- RECIPE & Associated tables
----------------------------------
DELETE FROM rcb.recipe;
INSERT INTO rcb.recipe (recipe_id, name            , status    , batch_id, sub_batch_id, previous_batch_id, date        , estimated_duration, type    , batch_yield, target_eff)
                VALUES (100,       'Tyndall Porter', 'PREPARED', 2047    , 1           , 2010             , CURRENT_DATE, 16                , 'Porter', 7          , 82);


DELETE FROM rcb.recipegrain;
INSERT INTO rcb.recipegrain (recipe_id, name, quantity) VALUES (100, 'Grain Type 1', 120);
INSERT INTO rcb.recipegrain (recipe_id, name, quantity) VALUES (100, 'Grain Type 2', 20);
INSERT INTO rcb.recipegrain (recipe_id, name, quantity) VALUES (100, 'Grain Type 3', 10);

DELETE FROM rcb.recipehop;
INSERT INTO rcb.recipehop (recipe_id, name, quantity, time) VALUES (100, 'Hop Type 1', 1.3, 10);
INSERT INTO rcb.recipehop (recipe_id, name, quantity, time) VALUES (100, 'Hop Type 2', 0.3, 60);

DELETE FROM rcb.recipeadjunct;
INSERT INTO rcb.recipeadjunct (recipe_id, name, quantity) VALUES (100, 'Adjunct Type 1', 2);
INSERT INTO rcb.recipeadjunct (recipe_id, name, quantity) VALUES (100, 'Adjunct Type 2', 2);
INSERT INTO rcb.recipeadjunct (recipe_id, name, quantity) VALUES (100, 'Adjunct Type 3', 2);
INSERT INTO rcb.recipeadjunct (recipe_id, name, quantity) VALUES (100, 'Adjunct Type 4', 2);


DELETE FROM rcb.recipebrewer;
INSERT INTO rcb.recipebrewer (recipe_id, name) VALUES (100, 'Matt');

DELETE FROM rcb.brewday;
INSERT INTO rcb.brewday (recipe_id, mash_rest_time_target, rest_temp_target, max_temp_target, boil_time_target,
                         boil_kettle_volume_target, pre_boil_gravity_target, flame_kettle_volume_target,
                         original_gravity_target, knockout_temp_target, ferm_temp_target)
VALUES (100, 120, 149, 170, 120, 8.46, 11.4, 8.0, 12.0, 56, 52);

DELETE FROM rcb.brewlog;
INSERT INTO rcb.brewlog (recipe_id, date, time, temp, gravity, ph, brewer, note)
VALUES (100, CURRENT_TIMESTAMP, '12:12', 65, 11.6, 4.3, 'MATT', 'Added essence of brussel sprout');
